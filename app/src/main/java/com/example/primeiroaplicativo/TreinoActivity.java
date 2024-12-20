package com.example.primeiroaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TreinoActivity extends AppCompatActivity {

    private Button  btnHomeT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        btnHomeT = findViewById(R.id.btnHomeT);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_treino);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void abrirTelaHome(View view){
        Intent it_telaHome = new Intent(this, MainActivity.class);
        startActivity(it_telaHome);}

    public void abrirTelaPerfil(View view){
        Intent it_telaHome = new Intent(this, CadastroActivity.class);
        startActivity(it_telaHome);}

    public void abrirTelaInfo(View view){
        Intent it_tela = new Intent(this, Info1.class);
        startActivity(it_tela);}

    public void abrirTreinoAMasc(View view){
        Intent it_telaHome = new Intent(this, TreinoA.class);
        startActivity(it_telaHome);}

    public void abrirTreinoBMasc(View view){
        Intent it_telaHome = new Intent(this, TreinoB.class);
        startActivity(it_telaHome);}

    public void abrirTreinoCMasc(View view){
        Intent it_telaHome = new Intent(this, TreinoC.class);
        startActivity(it_telaHome);}

    public void abrirTreinoAFem(View view){
        Intent it_telaHome = new Intent(this, TreinoAfeminino.class);
        startActivity(it_telaHome);}

    public void abrirTreinoBFem(View view){
        Intent it_telaHome = new Intent(this, TreinoBfeminino.class);
        startActivity(it_telaHome);}

    public void abrirTreinoCFem(View view){
        Intent it_telaHome = new Intent(this, TreinoCfeminino.class);
        startActivity(it_telaHome);}


}