package com.example.androidutilidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class content_listview_element extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_listview_element);

        TextView textView = findViewById(R.id.textViewNombre);
        textView.setText(getIntent().getStringExtra("nombre"));
    }
}
