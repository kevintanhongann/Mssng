package com.mssng.android.injector;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kevintan on 22/09/2016.
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    DatabaseReference providesBaseRef(){
        return FirebaseDatabase.getInstance().getReference();
    }


}
