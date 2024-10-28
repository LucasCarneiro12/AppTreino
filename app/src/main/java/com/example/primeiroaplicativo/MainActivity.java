package com.example.primeiroaplicativo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    private TextView tvNome, tvOla, textView;
    private Button btnHome, btnTreino, btnPerfil, btnInfo;
   // private ImageView imgMascHome;

    //@SuppressLint("MissingInflatedId")
   // @SuppressLint("SetTextI18n")
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

        SharedPreferences sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
        String nome = sharedPreferences.getString("nome", "nome não definido");


        setContentView(R.layout.activity_main);
        tvOla = findViewById(R.id.tvOla);
        //textView = findViewById(R.id.textView);

        /*if(tvNome != null){

            tvNome.setText("Olá, " + nome);
        }*/
       /* else{
            textView.setText("2");
            Log.e("MainActivity", "tvNome é null");
        }*/
        //tvNome.setText("Olá, Lucas");
        ImageView imgMascHome = findViewById(R.id.imgMascHome);

        btnPerfil = findViewById(R.id.btnPerfil);
        btnTreino = findViewById(R.id.btnTreino);
        //textView.setText("2");

        imgMascHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Ação a ser realizada ao clicar na imagem

                Intent intent = new Intent(MainActivity.this, TreinoActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Imagem clicada!", Toast.LENGTH_SHORT).show();


            }
        });





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

    public void abrirTelaTreino(View v){
        Intent it_telaTreino = new Intent(this, TreinoActivity.class);
        startActivity(it_telaTreino);

    }
    public void abrirTelaHome(View view){
        Intent it_telaHome = new Intent(this, MainActivity.class);
        startActivity(it_telaHome);

    }
}