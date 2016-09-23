package com.mssng.android;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kevintan on 23/09/2016.
 */

public class AddMissingPersonInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_addmissingperson);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button_submit)
    void onSubmitPersonClick(){
        // TODO: 23/09/2016 submit the data here using firebase
        finish();
    }
}
