package ucam.java.android.application_p2_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CadastroTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_tela);

       Button BtnCadastroAluno = (Button) findViewById(R.id.BtnCadastroAluno);
       Button BtnProgresso = (Button) findViewById(R.id.BtnProgresso);
       Button BtnInicio = (Button) findViewById(R.id.BtnInicio);


        BtnCadastroAluno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CadastroTela.this, CadastroAluno.class);
                startActivity(it);
            }
        });

        BtnProgresso.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CadastroTela.this, ProgressoTela.class);
                startActivity(it);
            }
        });

        BtnInicio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CadastroTela.this, LoginActivity.class);
                startActivity(it);
            }
        });

    }
}
