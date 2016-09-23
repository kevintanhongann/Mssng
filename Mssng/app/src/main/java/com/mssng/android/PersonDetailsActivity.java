package com.mssng.android;

import com.mssng.android.R;
import com.mssng.android.databinding.ActivityPersondetailsBinding;

import android.content.DialogInterface;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kevintan on 22/09/2016.
 */

public class PersonDetailsActivity extends AppCompatActivity {

    ActivityPersondetailsBinding viewBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_persondetails);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Subscribe
    public void onEvent(EventBusUtil.PersonDetailEvent event) {
        Log.d(TAG, "onEvent "+event.toString());
        viewBinding.setPerson(event.getPerson());
    }

    private static final String TAG = "PersonDetailsActivity";

    @OnClick(R.id.button_report)
    void onReportClick() {
        AlertDialog alertDialog = new AlertDialog.Builder(this).setTitle("Report").setMessage("Report you have seen the person with geotag? ").setPositiveButton("Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).show();
    }
}
