package com.mssng.android;

import com.google.firebase.database.DatabaseReference;
import com.mssng.android.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kevintan on 22/09/2016.
 */

public class PeopleListFragment extends Fragment {

    @BindView(R.id.recyclerview_personlist)
    RecyclerView mRecyclerView;

    @Inject
    DatabaseReference baseRef;

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


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        mRecyclerView.setLayoutManager(linearLayoutManager);

//        if (savedInstanceState != null) {
//            // Restore saved layout manager type.
//            mRecyclerViewPosition = (int) savedInstanceState
//                    .getSerializable(KEY_LAYOUT_POSITION);
//            mRecyclerView.scrollToPosition(mRecyclerViewPosition);
//            // TODO: RecyclerView only restores position properly for some tabs.
//        }
    }
}
