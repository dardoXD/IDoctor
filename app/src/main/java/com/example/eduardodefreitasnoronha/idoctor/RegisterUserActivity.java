package com.example.eduardodefreitasnoronha.idoctor;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterUserActivity extends AppCompatActivity {

    // TODO: Fazer a parte de registrar usuário

    private String name;
    private String email;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        Button botao = (Button)findViewById(R.id.BCadastrar);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }

    public void register(){
        Context context = getBaseContext();
        EditText password = (EditText)findViewById(R.id.Senha);
        EditText confirmPassword = (EditText)findViewById(R.id.ConfirmacaoSenha);
        if(password.getText().toString().equals(confirmPassword.getText().toString())){
            EditText name = (EditText)findViewById(R.id.Name);
            String nameString = name.getText().toString();

            EditText email = (EditText)findViewById(R.id.Email);
            String emailString = email.getText().toString();
            System.out.println("Chegou");
            String passwordString = password.getText().toString();
            if(passwordString.length() >= 3) {
                ControllerDB controllerDB = new ControllerDB(context);
                controllerDB.insert(nameString, passwordString, emailString);
            }
            else{
                //TODO: Apresentar erro de senha muito pequena
            }
        }
        else{
            //TODO: Apresentar mensagem de senhas diferentes
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {

        return name;
    }

}
