package com.devmeist3r.appminhaideiadb.model;

import android.util.Log;

import com.devmeist3r.appminhaideiadb.api.AppUtil;
import com.devmeist3r.appminhaideiadb.controller.ICrud;

public class Cliente implements ICrud<Cliente> {

    private int id; // chave primaria no banco de dados
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public void incluir(Cliente obj) {

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

