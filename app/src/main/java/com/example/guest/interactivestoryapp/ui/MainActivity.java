package com.example.guest.interactivestoryapp.ui;
//package com.example.guest.interactivestoryapp.R;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.guest.interactivestoryapp.R;

public class MainActivity extends AppCompatActivity {

    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText) findViewById(R.id.nameEditText);
        mStartButton = (Button) findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField.getText().toString();
                startStory(name);

            }
        });
    }

    private void startStory(String name) {
        Intent intent = new Intent(this, Story.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }
}