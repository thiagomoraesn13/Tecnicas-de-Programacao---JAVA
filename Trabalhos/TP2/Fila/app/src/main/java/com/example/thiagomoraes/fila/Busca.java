package com.example.thiagomoraes.fila;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Busca extends AppCompatActivity {
    private SQLiteDatabase bancoDeDados;
    private UsuarioDAO user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fila4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    ///Função para fazer a busca pelo cpf e retorna dados do paciente
    public void sendClick(View view){
        this.user = new UsuarioDAO(this);
        Intent intent = new Intent(this, MOSTRAR_DADOS.class);
        EditText inputCPF = (EditText) findViewById(R.id.inputCPF);
        Usuario usuario = user.Buscar(inputCPF.getText().toString());
        if(usuario != null){
        intent.putExtra("dados", usuario);
        startActivity(intent);}
        else{
            Toast.makeText(this, "Erro", Toast.LENGTH_SHORT).show();
        }
    }
}


