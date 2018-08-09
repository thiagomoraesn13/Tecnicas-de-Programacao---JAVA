package com.example.thiagomoraes.fila;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class UsuarioDAO {
    private SQLiteDatabase bancoDeDados;

    public UsuarioDAO(Context context) {
        this.bancoDeDados = (new BancoDeDados(context)).getWritableDatabase();
    }

    public boolean addUsuario(Usuario u) {
        try {
            String sqlCmd = "insert into Usuarios values(" +
                    "'"+u.getNome()+"', '"+u.getCpf()+"', '"+u.getMedico()+"', '"+u.getData()+"', '"+u.getHorario()+"', '"+u.getPrioridade()+"')";
            this.bancoDeDados.execSQL(sqlCmd);
            return true;
        } catch (SQLException e) {
            Log.e("Hello", e.getMessage());
            return false;
        }
    }


    public Usuario Buscar(String cpf) {
        Usuario usuario = null;

        String query = "select * from Usuarios where CPF='"+cpf+"'";
        Cursor cursor = this.bancoDeDados.rawQuery(query, null);


        if (cursor.moveToNext()){
         usuario = new Usuario(cursor.getString(0), cursor.getString(1), cursor.getString(2),
                    cursor.getString(3), cursor.getString(4), cursor.getString(5));
        }


        cursor.close();
        return usuario;


    }


}
