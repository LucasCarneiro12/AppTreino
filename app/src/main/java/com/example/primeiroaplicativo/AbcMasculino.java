package com.example.primeiroaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AbcMasculino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abc_masculino);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void abrirTreinoAMasc(View view){
        Intent it_telaHome = new Intent(this, TreinoA.class);
        startActivity(it_telaHome);}

    public void abrirTreinoBMasc(View view){
        Intent it_telaHome = new Intent(this, TreinoB.class);
        startActivity(it_telaHome);}

    public void abrirTreinoCMasc(View view){
        Intent it_telaHome = new Intent(this, TreinoC.class);
        startActivity(it_telaHome);}
}