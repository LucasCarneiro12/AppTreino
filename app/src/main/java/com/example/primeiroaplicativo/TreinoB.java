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
import com.example.primeiroaplicativo.masctreino_b.RemadaHalteresmas;

public class TreinoB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_treino_b);

        //remanda com halteres
        ImageView remandahalteres = findViewById(R.id.gif_remandahalteres);
        Glide.with(this).asGif().load(R.drawable.remadacurvadacomhalters).into(remandahalteres);

        // remada maquina
        ImageView remandamaquina = findViewById(R.id.gif_remandamaquina);
        Glide.with(this).asGif().load(R.drawable.remadamaquina).into(remandamaquina);

        //puxador
        ImageView puxador = findViewById(R.id.gif_puxador);
        Glide.with(this).asGif().load(R.drawable.puxador).into(puxador);

        // remada barra
        ImageView remadabarra = findViewById(R.id.gif_remadabarra);
        Glide.with(this).asGif().load(R.drawable.remadacurvadacombarra).into(remadabarra);

        // rosca direta
        ImageView roscadireta = findViewById(R.id.gif_roscadireta);
        Glide.with(this).asGif().load(R.drawable.roscadireta).into(roscadireta);

        // rosca scott
        ImageView roscascott = findViewById(R.id.gif_roscascott);
        Glide.with(this).asGif().load(R.drawable.roscascott).into(roscascott);

        // rosca inversa
        ImageView roscamartelo = findViewById(R.id.gif_roscamartelo);
        Glide.with(this).asGif().load(R.drawable.roscamartelo).into(roscamartelo);




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Inicar(View view){
        Intent it_tela = new Intent(this, RemadaHalteresmas.class);
        startActivity(it_tela);}
}