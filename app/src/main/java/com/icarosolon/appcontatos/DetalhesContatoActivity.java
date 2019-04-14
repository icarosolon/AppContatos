package com.icarosolon.appcontatos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhesContatoActivity extends AppCompatActivity {

    private String nome, telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_contato);


        TextView tvNome = findViewById(R.id.tv_nome);
        TextView tvTelefone = findViewById(R.id.tv_telefone);
        ImageView ligar = findViewById(R.id.iv_ligar);


        Intent intent = getIntent();

        nome = intent.getStringExtra("nome");
        telefone = intent.getStringExtra("telefone");


        tvNome.setText(nome);
        tvTelefone.setText(telefone);

        ligar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + telefone));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }
}
