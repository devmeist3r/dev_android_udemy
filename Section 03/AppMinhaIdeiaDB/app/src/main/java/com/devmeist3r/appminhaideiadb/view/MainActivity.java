package com.devmeist3r.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.devmeist3r.appminhaideiadb.R;
import com.devmeist3r.appminhaideiadb.api.AppUtil;
import com.devmeist3r.appminhaideiadb.controller.ClienteController;
import com.devmeist3r.appminhaideiadb.controller.ProdutoController;
import com.devmeist3r.appminhaideiadb.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;
    ProdutoController produtoController;

    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");

        objCliente = new Cliente();
        objCliente.setNome("Lucas Inocencio");
        objCliente.setEmail("luksinocencio@gmail.com");

        clienteController = new ClienteController(getApplicationContext());

        if (clienteController.incluir(objCliente)) {
            Toast.makeText(MainActivity.this, "Cliente " + objCliente.getNome()
                    + "incluido com sucesso", Toast.LENGTH_SHORT).show();
            Log.d(AppUtil.TAG, "Cliente " + objCliente.getNome()
                    + " incluido com sucesso");
        } else {
            Toast.makeText(MainActivity.this, "Cliente " + objCliente.getNome()
                    + "nao incluido", Toast.LENGTH_SHORT).show();
            Log.d(AppUtil.TAG, "Cliente " + objCliente.getNome()
                    + " nao incluido");
        }

        produtoController = new ProdutoController(getApplicationContext());
    }
}