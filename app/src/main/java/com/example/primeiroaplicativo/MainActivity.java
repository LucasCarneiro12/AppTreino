package com.example.primeiroaplicativo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    private Button btnHome, btnTreino, btnPerfil, btnInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Recupera as preferências
        SharedPreferences preferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);

        // Verifica se os dados estão preenchidos
        boolean isUserDataComplete = preferences.getBoolean("isUserDataComplete", false);

        // Se os dados não estão preenchidos ou estão incompletos, redireciona para a página de cadastro
        if (!isUserDataComplete) {
            Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
            startActivity(intent);
            finish();


        }

        btnPerfil = findViewById(R.id.btnPerfil);







        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void abrirTelaCadastro(View v){
        Intent it_telaCadastro = new Intent(this, CadastroActivity.class);
        startActivity(it_telaCadastro);

    }
}