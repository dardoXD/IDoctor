package com.example.eduardodefreitasnoronha.idoctor;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by eduardodefreitasnoronha on 10/11/17.
 */

public class ControllerDB {
    private SQLiteDatabase db;
    private CreateDB banco;

    public ControllerDB(Context context){
        banco = new CreateDB(context);
    }

    public String insert(String name, String password, String email){
        ContentValues values;
        long resultado;

        db = banco.getWritableDatabase();
        values = new ContentValues();

        values.put(CreateDB.getName(), name);
        values.put(CreateDB.getEmail(), email);
        values.put(CreateDB.getPassword(), password);

        resultado = db.insert(CreateDB.getUser(), null, values);
        db.close();

        if(resultado == -1)
            return "Erro ao inserir registro";
        else
            return "Registro inserido com sucesso";
    }
}
