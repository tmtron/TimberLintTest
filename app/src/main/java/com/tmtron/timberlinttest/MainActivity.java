package com.tmtron.timberlinttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.d("%s.%s", this.getLocalClassName(), "onCreate");
        setContentView(R.layout.activity_main);
        Timber.d("%s.%s", "onCreate");
    }
}
