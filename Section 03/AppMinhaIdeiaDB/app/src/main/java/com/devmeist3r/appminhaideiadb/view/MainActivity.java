package com.devmeist3r.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.devmeist3r.appminhaideiadb.R;
import com.devmeist3r.appminhaideiadb.api.AppUtil;
import com.devmeist3r.appminhaideiadb.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");

        clienteController = new ClienteController(getApplicationContext());
    }
}