package com.example.primeiroaplicativo.masctreino_b;

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
import com.example.primeiroaplicativo.TreinoB;
import com.example.primeiroaplicativo.masctreino_a.TreinoDesenMaquinamasc;
import com.example.primeiroaplicativo.masctreino_a.TreinoSupinoRetomasc;

public class RemadaHalteresmas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_remada_halteresmas);

        ImageView remadahalteres = findViewById(R.id.gif_remadahalteres);
        Glide.with(this).asGif().load(R.drawable.remadacurvadacomhalters).into(remadahalteres);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void abrirAnterior(View view){
        Intent it_tela = new Intent(this, TreinoB.class);
        startActivity(it_tela);}

   public void abrirProximo(View view){
        Intent it_tela = new Intent(this, RemadaMaquina.class);
        startActivity(it_tela);}
}