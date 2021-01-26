package com.devmeist3r.appminhaideiadb.datamodel;

public interface ICrud<C> {
    public void incluir();
    public void alterar();
    public void deletar();
    public void listar();
}
