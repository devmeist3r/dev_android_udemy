package com.devmeist3r.appminhaideiadb.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.devmeist3r.appminhaideiadb.api.AppUtil;
import com.devmeist3r.appminhaideiadb.datamodel.ClienteDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    private static final String DB_NAME = "AppMinhaIdeia.sqlite";
    private static final int DB_VERSION = 1;

    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: Criando Banco de dados");

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClienteDataModel.criarTabela());

        Log.d(AppUtil.TAG, "onCreate: Tabela Cliente criada... "+ ClienteDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
