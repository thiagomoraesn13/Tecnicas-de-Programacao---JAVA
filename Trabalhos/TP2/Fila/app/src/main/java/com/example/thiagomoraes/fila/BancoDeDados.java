package com.example.thiagomoraes.fila;

//import android.content.Context;
import android.content.Context;
import android.database.sqlite.*;


//Aqui criamos o banco de dados
public class BancoDeDados extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 4;
    public static final String DATABASE_NAME = "fila.db";

    private static final String SQL_CREATE_TABLES = "CREATE TABLE Usuarios('NOME' TEXT, 'CPF' TEXT PRIMARY KEY, 'MEDICO' TEXT, 'DIA' TEXT, 'HORA' TEXT, 'PRI' TEXT)";
    private static final String SQL_DELETE_TABLES = "DROP TABLE IF EXISTS Usuarios";
    //private static final String SQL_POPULATE_TABLES = "INSERT INTO Usuarios VALUES ('fulano@icomp.ufam.edu.br', '123', 'teste123', 'ASDSAA', 'ADA', 'DAD')";

    public BancoDeDados(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLES);
        ///        db.execSQL(SQL_POPULATE_TABLES);
    }
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL(SQL_DELETE_TABLES);
        onCreate(db);
    }


}
