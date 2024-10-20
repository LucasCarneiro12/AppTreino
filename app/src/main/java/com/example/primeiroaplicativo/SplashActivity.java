package com.example.primeiroaplicativo;

import android.os.Bundle;

import android.content.Intent;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    // Defina o tempo de exibição da Splash Screen (3000 milissegundos = 3 segundos)
    private static final int SPLASH_SCREEN_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        // Handler para adicionar um atraso de 3 segundos antes de iniciar a MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Após o tempo determinado, redireciona para a MainActivity
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                // Fecha a SplashActivity para que o usuário não possa voltar para ela
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}