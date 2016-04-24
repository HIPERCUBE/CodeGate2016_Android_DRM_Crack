package com.hipercube.codegate2016;

import android.app.Application;
import android.os.AsyncTask;
import android.os.Handler;

/**
 * Created by Joowon on 4/22/16.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        while (true) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Check data from Server
                }
            }, 60000);
        }
    }

    private class AsyncCheck extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            // Check data from Server
            return null;
        }
    }
}
