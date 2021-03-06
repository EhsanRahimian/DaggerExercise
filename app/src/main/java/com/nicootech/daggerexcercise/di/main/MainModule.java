package com.nicootech.daggerexcercise.di.main;

import com.nicootech.daggerexcercise.network.main.MainApi;
import com.nicootech.daggerexcercise.ui.main.posts.PostsRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostsRecyclerAdapter provideAdapter(){
        return new PostsRecyclerAdapter();
    }

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}
