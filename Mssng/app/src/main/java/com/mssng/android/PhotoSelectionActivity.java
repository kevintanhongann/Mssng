package com.mssng.android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.mssng.android.ui.UserProfileAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kevintan on 23/09/2016.
 */

public class PhotoSelectionActivity extends AppCompatActivity {

    @BindView(R.id.rvUserProfile)
    RecyclerView rvUserProfile;

    private UserProfileAdapter userPhotosAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photoselection);
        ButterKnife.bind(this);
        setupUserProfileGrid();
        userPhotosAdapter = new UserProfileAdapter(this);
        rvUserProfile.setAdapter(userPhotosAdapter);
    }

    private void setupUserProfileGrid() {
        final StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        rvUserProfile.setLayoutManager(layoutManager);
        rvUserProfile.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                userPhotosAdapter.setLockedAnimations(true);
            }
        });
    }
}
