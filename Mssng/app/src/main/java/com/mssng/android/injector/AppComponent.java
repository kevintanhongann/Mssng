package com.mssng.android.injector;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kevintan on 22/09/2016.
 */
@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
}
