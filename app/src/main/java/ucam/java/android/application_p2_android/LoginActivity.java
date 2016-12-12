package ucam.java.android.application_p2_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import ucam.java.android.application_p2_android.dao.LoginDAO;
import ucam.java.android.application_p2_android.model.Login;


public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button BtnLogin = (Button) findViewById(R.id.BtnLogin);
        Button BtnLimpar = (Button) findViewById(R.id.BtnLimpar);
        Button BtnCadastroAluno = (Button) findViewById(R.id.BtnCadastroAluno);
        final EditText TxtEmail = (EditText) findViewById(R.id.TxtEmail);
        final EditText TxtSenha = (EditText) findViewById(R.id.TxtSenha);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(LoginActivity.this, CadastroTela.class);
                startActivity(it);
            }
        });

        BtnLimpar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TxtEmail.setText("");
                TxtSenha.setText("");


            }
        });

        BtnCadastroAluno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Login login = new Login();
                login.setEmail(TxtEmail.getText());
                login.getSenha(TxtSenha.getText());

                LoginDAO dao = new LoginDAO(getApplicationContext());

            }
        });

    }

}