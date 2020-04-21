package com.example.androidutilidades.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.androidutilidades.R;
import com.example.androidutilidades.model.Persona;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Persona> {

    private List<Persona> personaList;
    private Context context;
    private int resourceLayout;

    public ListAdapter(@NonNull Context context, int resource, List<Persona> objects) {
        super(context, resource, objects);
        this.personaList = objects;
        this.resourceLayout = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(resourceLayout, null);
        }

        Persona persona = personaList.get(position);
        ImageView imagen = view.findViewById(R.id.imgRowView);
        imagen.setImageResource(persona.getImage());

        TextView nombre = view.findViewById(R.id.nombreRowView);
        nombre.setText(persona.getNombre());

        TextView edad = view.findViewById(R.id.edadRowView);
        edad.setText(persona.getEdad());


        return view;
    }
}
