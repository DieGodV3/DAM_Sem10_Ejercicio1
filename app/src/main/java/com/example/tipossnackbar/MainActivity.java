package com.example.tipossnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnShort,btnLargo,btnIndef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //vinculamos
        btnShort=findViewById(R.id.buttonShort);
        btnLargo=findViewById(R.id.buttonLargo);
        btnIndef=findViewById(R.id.buttonIndef);

        // Evento Click
        btnShort.setOnClickListener(this);
        btnLargo.setOnClickListener(this);
        btnIndef.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonShort){
            Snackbar.make(v, "Mostrando mensaje corto", Snackbar.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.buttonLargo){
            Snackbar.make(v, "Mostrando mensaje largo", Snackbar.LENGTH_LONG).show();
        }

        if(v.getId()==R.id.buttonIndef){
            Snackbar.make(v, "Mensaje de Tipo Indefinido", Snackbar.LENGTH_INDEFINITE).show();
        }
    }



    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}