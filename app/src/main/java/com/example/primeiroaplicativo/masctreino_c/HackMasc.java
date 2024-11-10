package com.example.primeiroaplicativo.masctreino_c;

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
import com.example.primeiroaplicativo.TreinoC;
import com.example.primeiroaplicativo.masctreino_b.Puxador;
import com.example.primeiroaplicativo.masctreino_b.RoscaDireta;

public class HackMasc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hack_masc);

        ImageView hack = findViewById(R.id.gif_hack);
        Glide.with(this).asGif().load(R.drawable.hack).into(hack);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void abrirAnterior(View view){
        Intent it_tela = new Intent(this, TreinoC.class);
        startActivity(it_tela);}

   public void abrirProximo(View view){
        Intent it_tela = new Intent(this, LegpressMasc.class);
        startActivity(it_tela);}
}