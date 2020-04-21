package com.example.androidutilidades;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonToast;
    private Button buttonAlert;
    private Button buttonChangeActivity;
    private Button buttonChangeWebView;
    private Button buttonChangeQRCode;
    private Button buttonChangeListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toast
        buttonToast = (Button) findViewById(R.id.buttonToast);
        eventClickToast(buttonToast);

        // Alert
        buttonAlert = (Button) findViewById(R.id.buttonAlert);
        eventClickAlertExit(buttonAlert);

        // Change Activity
        buttonChangeActivity = (Button) findViewById(R.id.buttonChangeActivity);
        changeActivity(buttonChangeActivity);

        // Change WebView
        buttonChangeWebView = (Button) findViewById(R.id.buttonOne);
        changeActivityWebView(buttonChangeWebView);

        // Change QRCode
        buttonChangeQRCode = (Button) findViewById(R.id.buttonTwo);
        changeActivityQRCode(buttonChangeQRCode);

        //Change ListViewApp
        buttonChangeListView = findViewById(R.id.buttonThree);
        changeActivityListView(buttonChangeListView);
    }

    public void eventClickToast(Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Execute Toast Short", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void changeActivity(Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditText.class);
                startActivity(intent);
            }
        });
    }

    public void changeActivityWebView(Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewApp.class);
                startActivity(intent);
            }
        });
    }

    public void changeActivityQRCode(Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QrCode.class);
                startActivity(intent);
            }
        });
    }

    public void changeActivityListView(Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, listViewApp.class);
                startActivity(intent);
            }
        });
    }

    public void eventClickAlertExit(Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertPropierties = new AlertDialog.Builder(MainActivity.this);
                alertPropierties.setMessage("¿Desea salir de la aplicación?")
                        .setCancelable(true)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                LayoutInflater img_alert = LayoutInflater.from(MainActivity.this);
                final View vista = img_alert.inflate(R.layout.imagen, null);

                AlertDialog alert = alertPropierties.create();
                alert.setTitle("Salida");
                alert.setView(vista);
                alert.show();
            }
        });
    }

}
