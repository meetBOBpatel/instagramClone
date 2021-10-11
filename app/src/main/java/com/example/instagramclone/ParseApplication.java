package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("pDG5KOuNQYZHPDiqbXG31EdNng3UYjrT7Bz3SMQM")
                .clientKey("yDU62U8DUNqGVuEvaEi97sSnG2oS6e80BEduTQAw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
