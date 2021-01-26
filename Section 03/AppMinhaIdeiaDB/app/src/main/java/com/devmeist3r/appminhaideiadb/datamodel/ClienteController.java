package com.devmeist3r.appminhaideiadb.datamodel;

import android.util.Log;

import com.devmeist3r.appminhaideiadb.api.AppUtil;
import com.devmeist3r.appminhaideiadb.model.Cliente;

public class ClienteController implements ICrud<Cliente>{

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "incluir: Cliente");
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "alterar: Cliente");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "deletar: Cliente");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "listar: Cliente");
    }
}
