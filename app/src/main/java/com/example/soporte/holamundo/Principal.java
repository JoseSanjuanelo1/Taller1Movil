package com.example.soporte.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private EditText cajaNombre, cajaNombre2;
    private EditText cajaApellido, cajaApellido2;
    private EditText cajaEdad, cajaSexo;
    private Intent i;
    private Bundle b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaNombre = (EditText)findViewById(R.id.txtNombre);
        cajaNombre2 = (EditText)findViewById(R.id.txtNombre2);
        cajaApellido =(EditText)findViewById(R.id.txtapellido);
        cajaApellido2 = (EditText)findViewById(R.id.txtApellido2);
        cajaEdad = (EditText)findViewById(R.id.txtEdad);
        cajaSexo = (EditText)findViewById(R.id.txtSexo);
        i = new Intent(this,Saludo.class);
        b = new Bundle();
        //cajaMensaje = (TextView)findViewById(R.id.lblMensaje);
    }
    public void limpiar(View v){
        cajaNombre.setText("");cajaNombre2.setText("");
        cajaApellido.setText("");
        cajaApellido2.setText("");
        cajaEdad.setText("");
        cajaSexo.setText("");
    }

    public void saludar(View v){

        String nombre, nombre2, apellido, apellido2, edad, sexo;
        if (validar()){
            nombre = cajaNombre.getText().toString();
            nombre2 = cajaNombre2.getText().toString();
            apellido = cajaApellido.getText().toString();
            apellido2 = cajaApellido2.getText().toString();
            edad = cajaEdad.getText().toString();
            sexo = cajaSexo.getText().toString();

            b.putString("Nombre", nombre);
            b.putString("Apellido", apellido);
            b.putString("Nombre2", nombre2);
            b.putString("Apellido2", apellido2);
            b.putString("Edad", edad);
            b.putString("Sexo", sexo);
            i.putExtras(b);

            startActivity(i);
        }

        //cajaMensaje.setText(getResources().getString(R.string.parte_saludo)+" "+aux);


    }

    public boolean validar(){
        if (cajaNombre.getText().toString().isEmpty() ){

            cajaNombre.setError(getResources().getString(R.string.error_1));
            return false;
        }

        if (cajaNombre2.getText().toString().isEmpty()){

            cajaNombre2.setError(getResources().getString(R.string.error_3));
            return false;
        }

        if (cajaApellido.getText().toString().isEmpty()){

            cajaApellido.setError(getResources().getString(R.string.error_2));
            return false;
        }

        if (cajaApellido2.getText().toString().isEmpty()){

            cajaApellido2.setError(getResources().getString(R.string.error_4));
            return false;
        }

        if (cajaEdad.getText().toString().isEmpty()){

            cajaEdad.setError(getResources().getString(R.string.error_5));
            return false;
        }

        if (cajaSexo.getText().toString().isEmpty()){

            cajaSexo.setError(getResources().getString(R.string.error_6));
            return false;
        }
        return true;
    }
}















