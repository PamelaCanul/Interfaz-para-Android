package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.example.Modelos.UsuarioModelo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = (TextView)findViewById(R.id.txv1);
        text1.setText("Hola");

        UsuarioModelo usuario = new UsuarioModelo();
        usuario.setNombre("Fulanito");

        TextView textusuario = (TextView)findViewById(R.id.txv2);
        textusuario.setText(usuario.getNombre());

    }
}