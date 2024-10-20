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
import androidx.fragment.app.FragmentTransaction;

import com.example.primeiroaplicativo.fragments.HomeFragment;
import com.example.primeiroaplicativo.fragments.InfoFragment;
import com.example.primeiroaplicativo.fragments.PerfilFragment;
import com.example.primeiroaplicativo.fragments.TreinoFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnHome, btnTreino, btnPerfil, btnInfo;
    private HomeFragment homeFragment;
    private TreinoFragment treinoFragmemnt;
    private PerfilFragment perfilFragment;
    private InfoFragment infoFragment;

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



        //menu de baixo
     /*   btnHome = findViewById(R.id.btnHome);
        btnTreino = findViewById(R.id.btnTreino);
        btnInfo = findViewById(R.id.btnInfo);
        btnPerfil = findViewById(R.id.btnPerfil);

        //instaciar os fragments
        homeFragment = new HomeFragment();


        //configurar os fragmentos
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, homeFragment);
        transaction.commit();

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, homeFragment);
                transaction.commit();
            }
        });


        btnTreino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                treinoFragmemnt = new TreinoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, treinoFragmemnt);
                transaction.commit();
            }
        });

        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perfilFragment = new PerfilFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, perfilFragment);
                transaction.commit();
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoFragment = new InfoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, infoFragment);
                transaction.commit();
            }
        });


        */




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