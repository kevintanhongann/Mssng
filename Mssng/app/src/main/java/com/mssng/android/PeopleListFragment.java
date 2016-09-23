package com.mssng.android;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.ValueEventListener;
import com.mssng.android.domain.Person;
import com.mssng.android.ui.PersonViewHolder;
import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.internal.DebouncingOnClickListener;

/**
 * Created by kevintan on 22/09/2016.
 */

public class PeopleListFragment extends Fragment {

    @BindView(R.id.recyclerview_personlist)
    RecyclerView mRecyclerView;

    @Inject
    DatabaseReference baseRef;

    private FirebaseRecyclerAdapter<Person, PersonViewHolder> mAdapter;


    private static final String TAG = "PeopleListFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personlist, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MssngApplication application = (MssngApplication) getActivity().getApplication();
        application.getAppComponent().inject(this);


//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
//        linearLayoutManager.setReverseLayout(true);
//        linearLayoutManager.setStackFromEnd(true);
//        mRecyclerView.setLayoutManager(linearLayoutManager);

//        if (savedInstanceState != null) {
//            // Restore saved layout manager type.
//            mRecyclerViewPosition = (int) savedInstanceState
//                    .getSerializable(KEY_LAYOUT_POSITION);
//            mRecyclerView.scrollToPosition(mRecyclerViewPosition);
//            // TODO: RecyclerView only restores position properly for some tabs.
//        }

        final DatabaseReference personDbRef = baseRef.child("persons");

        Log.d(TAG, "personDbRef "+personDbRef.toString());

        mAdapter = new FirebaseRecyclerAdapter<Person, PersonViewHolder>(Person.class, R.layout.layout_person_row, PersonViewHolder.class, personDbRef) {
            @Override
            protected void populateViewHolder(final PersonViewHolder viewHolder, final Person model, int position) {
                Log.d(TAG, "position "+position + " model "+model.toString());
                viewHolder.tvLastSeen.setText("Last seen "+ model.getLastSeen());
                viewHolder.tvName.setText(model.getFirstname());
                Picasso.with(getActivity()).load(model.getImageUrls()).into(viewHolder.mImageView);

                viewHolder.itemView.setOnClickListener(new DebouncingOnClickListener() {
                    @Override
                    public void doClick(View v) {
                        Intent personDetailIntent = new Intent(getActivity(), PersonDetailsActivity.class);
                        startActivity(personDetailIntent);
                        EventBus.getDefault().post(new EventBusUtil.PersonDetailEvent(model));
                    }
                });
            }
        };

        mRecyclerView.setAdapter(mAdapter);


        // TODO: 23/09/2016 add geofences

    }
}
