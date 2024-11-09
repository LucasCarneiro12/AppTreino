package com.example.primeiroaplicativo.masctreino_a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.example.primeiroaplicativo.R;
import com.example.primeiroaplicativo.TreinoA;

public class TreinoCrucifixomasc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_treino_crucifixomasc);

        ImageView  crucifixo = findViewById(R.id.gif_crucifixo);
        Glide.with(this).asGif().load(R.drawable.crucifixo_reto).into(crucifixo);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void abrirAnterior(View view){
        Intent it_tela = new Intent(this, TreinoA.class);
        startActivity(it_tela);}

    public void abrirProximo(View view){
        Intent it_tela = new Intent(this, TreinoSupinoInclinadomasc.class);
        startActivity(it_tela);}
}