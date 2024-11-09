package com.example.primeiroaplicativo;

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
import com.example.primeiroaplicativo.masctreino.TreinoCrucifixomasc;

public class TreinoA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_treino_a);

        //crucifixo
        ImageView crucifixo = findViewById(R.id.gif_crucifixo);
        Glide.with(this).asGif().load(R.drawable.crucifixo_reto).into(crucifixo);
        //supino inclinado
        ImageView supinoinclinado = findViewById(R.id.gif_supinoinclinado);
        Glide.with(this).asGif().load(R.drawable.supinoinclinado).into(supinoinclinado);
        //supino maquina
        ImageView supinomaquina = findViewById(R.id.gif_supinomaquina);
        Glide.with(this).asGif().load(R.drawable.supinomaquina).into(supinomaquina);
        //supino reto
        ImageView supino_reto = findViewById(R.id.gif_supinoreto);
        Glide.with(this).asGif().load(R.drawable.supino_reto).into(supino_reto);


        //elevacao lateral
        ImageView elevacaolateral = findViewById(R.id.gif_elevacaolateral);
        Glide.with(this).asGif().load(R.drawable.elevacaolateral).into(elevacaolateral);

        //desenvolvimento maquina
        ImageView desenvolvimentomaquina = findViewById(R.id.gif_desenvolvimentomaquina);
        Glide.with(this).asGif().load(R.drawable.desenvolvimentomaquina).into(desenvolvimentomaquina);

        //tricepspuley
        ImageView tricepspuley = findViewById(R.id.gif_tricepspuley);
        Glide.with(this).asGif().load(R.drawable.tricepspuley).into(tricepspuley);


        //tricepsdip
        ImageView tricepsdip = findViewById(R.id.gif_tricepsdip);
        Glide.with(this).asGif().load(R.drawable.tricepsdip).into(tricepsdip);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void abrirIniciar(View view){
        Intent it_tela = new Intent(this, TreinoCrucifixomasc.class);
        startActivity(it_tela);}

}