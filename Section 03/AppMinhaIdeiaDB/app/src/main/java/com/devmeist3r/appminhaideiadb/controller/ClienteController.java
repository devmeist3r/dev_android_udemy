package com.devmeist3r.appminhaideiadb.controller;

import android.content.Context;
import android.util.Log;

import com.devmeist3r.appminhaideiadb.api.AppUtil;
import com.devmeist3r.appminhaideiadb.datasource.AppDataBase;
import com.devmeist3r.appminhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase {

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }

}
