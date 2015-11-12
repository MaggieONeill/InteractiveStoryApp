package com.example.guest.interactivestoryapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.guest.interactivestoryapp.R;

/**
 * Created by Guest on 11/11/15.
 */
public class Story extends AppCompatActivity {

    public static final String TAG = Story.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

            Intent intent = getIntent();
            String name = intent.getStringExtra(getString(R.string.key_name));

            if(name == null){
                name = "friend";
            }
            Log.d(TAG, name);

    }

}
