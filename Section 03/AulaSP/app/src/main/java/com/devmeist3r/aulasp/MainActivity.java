package com.devmeist3r.aulasp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    
    private static final String TAG = "APP_AULA_SP";
    private static final String PREF_NOME = "APP_AULA_SP_PREF";

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: Rodando");
        sharedPreferences = getSharedPreferences(PREF_NOME, Context.MODE_PRIVATE);
        Log.i(TAG, "onCreate: Pasta shared criada");
    }
    
}