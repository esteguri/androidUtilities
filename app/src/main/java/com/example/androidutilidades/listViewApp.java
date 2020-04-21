package com.example.androidutilidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidutilidades.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class listViewApp extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private List<Persona> listaPersona = new ArrayList<>();
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_app);

        listView = findViewById(R.id.listView);
        listView.setOnItemClickListener(this);
        listaPersona.add(new Persona("Esteban", "21", R.mipmap.ic_launcher_round));
        listaPersona.add(new Persona("Carlos", "21", R.mipmap.ic_launcher));
        listaPersona.add(new Persona("Fernando", "21", R.mipmap.ic_launcher_round));
        listaPersona.add(new Persona("Jacinto", "21", R.mipmap.ic_launcher));
        adapter = new com.example.androidutilidades.adapters.ListAdapter(listViewApp.this, R.layout.item_row, listaPersona);

        listView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(listViewApp.this, "Elemento tocado: "+ position, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, content_listview_element.class);
        intent.putExtra("nombre", listaPersona.get(position).getNombre());
        startActivity(intent);
    }
}
