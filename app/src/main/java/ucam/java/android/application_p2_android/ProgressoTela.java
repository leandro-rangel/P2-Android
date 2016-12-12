package ucam.java.android.application_p2_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressoTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresso_tela);


        Button BtnVoltar = (Button) findViewById(R.id.BtnVoltar);
        Button BtnInicio3 = (Button) findViewById(R.id.BtnInicio3);


        BtnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ProgressoTela.this, CadastroTela.class);
                startActivity(it);
            }
        });

        BtnInicio3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ProgressoTela.this, LoginActivity.class);
                startActivity(it);
            }
        });

    }
}
