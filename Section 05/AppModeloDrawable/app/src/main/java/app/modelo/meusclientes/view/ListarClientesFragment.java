package app.modelo.meusclientes.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import app.modelo.meusclientes.R;
import app.modelo.meusclientes.controller.ClienteController;
import app.modelo.meusclientes.model.Cliente;


public class ListarClientesFragment extends Fragment {

    // Fragment - Classe responsável pela camada de VISÃO (Layout)
    View view;

    EditText edtPesquisarNome;
    ListView listView;
    List<Cliente> clienteList;
    List<String> clientes;
    ArrayAdapter<String> clienteAdapter;
    ArrayList<HashMap<String, String>> filtroClientes;

    ClienteController clienteController;
    Cliente obj;

    public ListarClientesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_listar_clientes, container, false);

        TextView txtTitulo = view.findViewById(R.id.txtTitulo);

        txtTitulo.setText(R.string.listar_clientes);

        clienteController = new ClienteController(getContext());

        clienteList = clienteController.listar();

        listView = (ListView) view.findViewById(R.id.listView);

        edtPesquisarNome = view.findViewById(R.id.edtPesquisarNome);

        clientes = new ArrayList<>();

        // TODO - Implementar regra de negócio na controloradora da classe cliente

        for (Cliente obj: clienteList) {
            clientes.add(obj.getId() + ". " + obj.getNome());
        }

        clienteAdapter = new ArrayAdapter<>(getContext(), R.layout.listar_cliente_item, R.id.txtItemLista, clientes);

        listView.setAdapter(clienteAdapter);

        return view;
    }


}