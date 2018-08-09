package com.example.thiagomoraes.fila;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fila3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    //funcao para pegar os dados do cadastro e marcacao de consulta e cadastra no sistema
    public void Cadastrar(View view) {
        EditText inputNome = (EditText) findViewById(R.id.imputnome);
        EditText inputCpf = (EditText) findViewById(R.id.imputcpf);
        EditText inputMedico = (EditText) findViewById(R.id.imputmedico);
        EditText inputData = (EditText) findViewById(R.id.imputdata);
        EditText inputHora = (EditText) findViewById(R.id.imputhora);
        EditText inputPri = (EditText) findViewById(R.id.imputpri);

        Usuario usuario = new Usuario(inputNome.getText().toString(), inputCpf.getText().toString(),
                inputMedico.getText().toString(), inputData.getText().toString(), inputHora.getText().toString(),
                inputPri.getText().toString());
        UsuarioDAO usuarioDAO = new UsuarioDAO(this);
        if(usuarioDAO.addUsuario(usuario)){
            Toast.makeText(this, "Cadastro criado", Toast.LENGTH_SHORT).show();
            finish();
        }
        else{
            Toast.makeText(this, "Cadastro Falhou", Toast.LENGTH_SHORT).show();

        }

    }
}
