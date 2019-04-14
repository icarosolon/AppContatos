package com.icarosolon.appcontatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nome, telefone;
    private Button salvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarViews();

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,DetalhesContatoActivity.class);
                intent.putExtra("nome", String.valueOf(nome.getText()));
                intent.putExtra("telefone", String.valueOf(telefone.getText()));
                startActivity(intent);
            }
        });

    }

    public void iniciarViews(){
        nome = findViewById(R.id.edt_nome);
        telefone = findViewById(R.id.edt_telefone);
        salvar = findViewById(R.id.btn_salvar);
    }

}
