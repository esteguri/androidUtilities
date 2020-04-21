package com.example.androidutilidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EditText extends AppCompatActivity {

    private Button buttonVerify;
    private android.widget.EditText editVerify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text);

        buttonVerify = (Button) findViewById(R.id.buttonVerify);
        editVerify = (android.widget.EditText) findViewById(R.id.editVerify);
        eventClickButtonVerify(buttonVerify);
    }
    
    public void eventClickButtonVerify(Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verificar = editVerify.getText().toString();
                if(verificar.isEmpty()){
                    editVerify.setError("No se ingreso ningun caracter");
                }else{
                    Toast.makeText(EditText.this, "Edit Text correcto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
