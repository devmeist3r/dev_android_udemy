package com.devmeist3r.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.devmeist3r.appminhaideiadb.api.AppUtil;
import com.devmeist3r.appminhaideiadb.datamodel.ClienteDataModel;
import com.devmeist3r.appminhaideiadb.datasource.AppDataBase;
import com.devmeist3r.appminhaideiadb.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadoDoObjeto;

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }

    @Override
    public boolean incluir(Cliente obj) {
        dadoDoObjeto = new ContentValues();
        // Key, Valor

        /**
         *
         * dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());
         * ID é a chave primaria da tabela cliente
         * é gerada automaticamente pelo SQLite a cada
         * novo registro adicionado
         * INSERIR
         * SQL ->>> INSERT
         * */

        dadoDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());

        /**
         *
         * Enviar os dados (dadoDoObjeto) para a classe AppDataBase
         * utilizando um método capaz de adicionar o OBJ no banco de
         * dados, tabela qualquer um (Cliente)
         *
         * */

        return true;
    }

    @Override
    public boolean alterar(Cliente obj) {
        dadoDoObjeto = new ContentValues();
        // Key, Valor

        /**
         *
         * dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());
         * ID é a chave primaria da tabela cliente
         * é gerada automaticamente pelo SQLite a cada
         * novo registro adicionado
         * ALTERAR
         * SQL ->>> UPDATE
         * */

        dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());
        dadoDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());

        /**
         *
         * Enviar os dados (dadoDoObjeto) para a classe AppDataBase
         * utilizando um método capaz de alterar o OBJ no banco de
         * dados, tabela qualquer um (Cliente), respeitando o ID
         * ou PK (PrimaryKey)
         *
         * */

        return true;
    }

    @Override
    public boolean deletar(Cliente obj) {
        dadoDoObjeto = new ContentValues();
        // Key, Valor

        /**
         *
         * dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());
         * ID é a chave primaria da tabela cliente
         * é gerada automaticamente pelo SQLite a cada
         * novo registro adicionado
         * DELETAR
         * SQL ->>> DELETE from TABELA where ID = ?????
         * */

        dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());

        /**
         *
         * Enviar os dados (dadoDoObjeto) para a classe AppDataBase
         * utilizando um método capaz de deletar o OBJ no banco de
         * dados, tabela qualquer um (Cliente), respeitando o ID
         * ou PK (PrimaryKey)
         * Condição, o registro tem que ser igual ao ID informado
         * */

        return true;
    }

    @Override
    public List<Cliente> listar() {

        List<Cliente> lista = new ArrayList<>();

        return lista;
    }
}
