package com.example.eduardodefreitasnoronha.idoctor;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginUser(View view){
        Intent intent = new Intent(this, LoginUserActivity.class);
        startActivity(intent);
        //TODO: Verificar se login e senha estão corretos
    }

    public void registerUser(View view){
        Intent intent = new Intent(this, RegisterUserActivity.class);
        startActivity(intent);
    }
}
