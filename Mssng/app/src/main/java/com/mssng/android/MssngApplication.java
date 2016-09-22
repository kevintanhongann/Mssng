package com.mssng.android;

import android.app.Application;

import com.mssng.android.injector.AppComponent;
import com.mssng.android.injector.AppModule;
import com.mssng.android.injector.DaggerAppComponent;

/**
 * Created by kevintan on 22/09/2016.
 */

public class MssngApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
