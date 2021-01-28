package com.devmeist3r.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.devmeist3r.appminhaideiadb.api.AppUtil;
import com.devmeist3r.appminhaideiadb.datamodel.ClienteDataModel;
import com.devmeist3r.appminhaideiadb.datasource.AppDataBase;
import com.devmeist3r.appminhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadosDoObjeto;

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }

    @Override
    public void incluir(Cliente obj) {
        dadosDoObjeto = new ContentValues();

        dadosDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadosDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());
    }

    @Override
    public void alterar(Cliente obj) {

    }

    @Override
    public void deletar(Cliente obj) {

    }

    @Override
    public void listar(Cliente obj) {

    }
}
