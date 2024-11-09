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

public class RoscaDireta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rosca_direta);

        ImageView roscadireta= findViewById(R.id.gif_roscadireta);
        Glide.with(this).asGif().load(R.drawable.roscadireta).into(roscadireta);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void abrirAnterior(View view){
        Intent it_tela = new Intent(this, RemadaBarra.class);
        startActivity(it_tela);}

   public void abrirProximo(View view){
        Intent it_tela = new Intent(this, RoscaScott.class);
        startActivity(it_tela);}
}