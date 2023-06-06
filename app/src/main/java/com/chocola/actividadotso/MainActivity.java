package com.chocola.actividadotso;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.plant(new DebugTree());
        Timber.d("Llamado desde onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Timber.d("Llamado desde onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Timber.d("Llamado desde onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Timber.d("Llamado desde onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Timber.d("Llamado desde onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Timber.d("Llamado desde onDestroy");
    }
}