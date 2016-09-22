package com.mssng.android;

import com.mssng.android.R;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kevintan on 22/09/2016.
 */

public class PersonDetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_persondetails);
    }

    public void onEvent(EventBusUtil.PersonDetailEvent event) {
        if (event != null) {

        }
    }
}
