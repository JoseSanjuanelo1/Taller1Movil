package com.example.soporte.holamundo;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {

    private TextView Saludo;
    private Bundle b;
    private String aux, nombre, nombre2, apellido, apellido2, edad, sexo;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        Saludo = (TextView)findViewById(R.id.txtSaludo);
        b = getIntent().getExtras();
        nombre = b.getString("Nombre");
        nombre2 = b.getString("Nombre2");
        apellido = b.getString("Apellido");
        apellido2 = b.getString("Apellido2");
        edad = b.getString("Edad");
        sexo = b.getString("Sexo");
        res=this.getResources();
        aux = res.getString(R.string.parte_saludo)+" "+nombre+" "+nombre2+" "+apellido+" "+apellido2+", "+res.getString(R.string.ParteS2)+" "+edad+" "+res.getString(R.string.ParteS3)+" "+sexo;
        Saludo.setText(aux);
    }
}
