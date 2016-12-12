package ucam.java.android.application_p2_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CadastroAluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);
        Button BotaoOK = (Button) findViewById(R.id.BtnOk2);
        Button BotaoLimpar2 = (Button) findViewById(R.id.BtnLimpar2);
        Button BotaoInicio2 = (Button) findViewById(R.id.BtnInicio2);
        final EditText NomeTexto = (EditText) findViewById(R.id.TxTNome);
        final EditText EnderecoTexto = (EditText) findViewById(R.id.TxtEndereco);
        final EditText EmailTexto = (EditText) findViewById(R.id.TxtEmail);
        final EditText TelefoneTexto = (EditText) findViewById(R.id.TxtTelefone);
        final EditText NascimentoTexto = (EditText) findViewById(R.id.TxtDtNasc);



        BotaoInicio2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CadastroAluno.this, LoginActivity.class);
                startActivity(it);
            }
        });




        BotaoLimpar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              NomeTexto.setText("");
              EnderecoTexto.setText("");
              EmailTexto.setText("");
              TelefoneTexto.setText("");
              NascimentoTexto.setText("");

            }
        });

    }
}
