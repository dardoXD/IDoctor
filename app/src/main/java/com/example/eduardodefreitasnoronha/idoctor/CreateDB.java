package com.example.eduardodefreitasnoronha.idoctor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by eduardodefreitasnoronha on 10/11/17.
 */

public class CreateDB extends SQLiteOpenHelper{
    private static final String NameDB = "dbIDoctor.db";

    private static final String User = "user";
    private static final String Name = "name";
    private static final String Email = "email";
    private static final String ID = "_id";
    private static final String Password = "password";

    private static final String Medic = "medic";
    private static final String idMedic = "_idMedic";
    private static final String Endereco = "endereco";
    private static final String Telefone = "telefone";
    private static final String AtendePlano = "plano";

    private static final int Version = 1;

    public CreateDB(Context context){
        super(context, getNameDB(), null, getVersion());
    }

    public static String getName() {
        return Name;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE " + getUser() + " (" + getID() + "integer primary key autoincrement, "
                + getName() + " text, "+ getEmail() + " text, " + getPassword() + " text)";
        db.execSQL(sql);

        sql = "CREATE TABLE " + getMedic() + " (" + getIdMedic() + "integer primary key autoincrement, "
                + getEndereco() + " text, " + getTelefone() + " text, " + getAtendePlano() + "text)";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + getUser());
        db.execSQL("DROP TABLE IF EXISTS " + getMedic());
        onCreate(db);
    }

    public void insert(SQLiteDatabase db){

    }

    public static String getNameDB() {
        return NameDB;
    }

    public static String getUser() {
        return User;
    }

    public static String getEmail() {
        return Email;
    }

    public static String getID() {
        return ID;
    }

    public static String getPassword() {
        return Password;
    }

    public static String getMedic() {
        return Medic;
    }

    public static String getIdMedic() {
        return idMedic;
    }

    public static String getEndereco() {
        return Endereco;
    }

    public static String getTelefone() {
        return Telefone;
    }

    public static String getAtendePlano() {
        return AtendePlano;
    }

    public static int getVersion() {
        return Version;
    }
}
