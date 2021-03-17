package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initializes parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //register your Parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Z4oIsHDMsGlQMfpf4grFu58Nml7QVW5weUqCoKEX")
                .clientKey("xd4DpicCGX5ojtAhtpEyCarGo0Y4ORuLK3neSsCH")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
