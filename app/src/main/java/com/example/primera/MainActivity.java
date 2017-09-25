package com.example.primera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

//importamos el paquete para View.OnClickListener
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Objetos que usaremos

    TextView texto;

    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Guardamos los valores iniciales de los objetos

        texto = (TextView) findViewById(R.id.textView);
        boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
     if (view == boton)
         actualizar();
    }

    private void actualizar() {
        texto.setText(new Date().toString());
        boton.setText(R.string.actualizar_fecha);
    }
}
