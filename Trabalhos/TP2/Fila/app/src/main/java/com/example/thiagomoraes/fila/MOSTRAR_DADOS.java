package com.example.thiagomoraes.fila;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MOSTRAR_DADOS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar__dados);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        Usuario dado = (Usuario) intent.getSerializableExtra("dados");
        TextView textBemVindo =  (TextView) findViewById(R.id.mostrarinfo);
        textBemVindo.setText(Html.fromHtml(
                "Olá <b>" + dado.getNome() +
                        "</b>! Seu cpf é: <b>" + dado.getCpf() +
                        "</b> \n: E seu médico é: <b>" + dado.getMedico() +
                        "</b> \n: A Data da sua consulta é: <b>" + dado.getData() +
                        "</b> \n: O horário é: <b>" + dado.getHorario() +
                        "</b> \n: E você está na fila de prioridades : <b>" + dado.getPrioridade() +
                        "</b>.<br><br>Bem Vindo!"));


    }
}
