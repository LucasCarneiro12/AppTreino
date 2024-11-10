package com.example.primeiroaplicativo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CadastroActivity extends AppCompatActivity {

    private EditText etIdade, etAltura, etPeso, etDiasSemana, etNome;
    private Button btnSalvar;
    private CheckBox cbMasculino, cbFeminino;
    String sexo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro);


        etNome = findViewById(R.id.etNome);
        cbMasculino = findViewById(R.id.cbMasculino);
        cbFeminino = findViewById(R.id.cbFeminino);
        etAltura = findViewById(R.id.etAltura);
        etIdade = findViewById(R.id.etIdade);
        etDiasSemana = findViewById(R.id.etDiasSemana);
        etPeso = findViewById(R.id.etPeso);
        btnSalvar = findViewById(R.id.btnSalvar);
        if(cbMasculino.isChecked()){
            sexo = "Masculino";
        }
        else{
            if(cbFeminino.isChecked()){
                sexo = "Feminino";
            }
        }

      /*  btnSalvar.setOnClickListener(view -> {
            // Verifica se os dados estão preenchidos corretamente
            String altura = etAltura.getText().toString();
            String peso = etPeso.getText().toString();
            String idade = etIdade.getText().toString();
            String nome = etNome.getText().toString();
            String diasSemana = etDiasSemana.getText().toString();



            if (altura.isEmpty() || peso.isEmpty() ||diasSemana.isEmpty() || idade.isEmpty()) {
                Toast.makeText(this, "Preencha todos os dados!", Toast.LENGTH_SHORT).show();
                return;
            }


            // Salva os dados no SharedPreferences
            SharedPreferences preferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("nome", nome);
            editor.putString("altura", altura);
            editor.putString("peso", peso);
            editor.putString("idade", idade);
            editor.putString("Dias da Semana", diasSemana);
            editor.putString("sexo", sexo);

            editor.putBoolean("isUserDataComplete", true);
            editor.apply();

            // Redireciona para a home
            Intent intent = new Intent(CadastroActivity.this, MainActivity.class);
            startActivity(intent);
            finish();

        });*/

        /*btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarDados();
            }
        });*/

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
/*
    private void salvarDados() {
        // Verifica se os dados estão preenchidos corretamente
        String altura = etAltura.getText().toString();
        String peso = etPeso.getText().toString();
        String idade = etIdade.getText().toString();
        String nome = etNome.getText().toString();
        String diasSemana = etDiasSemana.getText().toString();



        if (altura.isEmpty() || peso.isEmpty() ||diasSemana.isEmpty() || idade.isEmpty()) {
            Toast.makeText(this, "Preencha todos os dados!", Toast.LENGTH_SHORT).show();
            return;
        }


        // Salva os dados no SharedPreferences
        SharedPreferences preferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("nome", nome);
        editor.putString("altura", altura);
        editor.putString("peso", peso);
        editor.putString("idade", idade);
        editor.putString("Dias da Semana", diasSemana);
        editor.putString("sexo", sexo);

        editor.putBoolean("isUserDataComplete", true);
        editor.apply();

        // Redireciona para a home
        Intent intent = new Intent(CadastroActivity.this, MainActivity.class);
        startActivity(intent);
        finish();


    }*/

    public void salvarInfo(View v){
        // Verifica se os dados estão preenchidos corretamente
        String altura = etAltura.getText().toString();
        String peso = etPeso.getText().toString();
        String idade = etIdade.getText().toString();
        String nome = etNome.getText().toString();
        String diasSemana = etDiasSemana.getText().toString();



        if (altura.isEmpty() || peso.isEmpty() ||diasSemana.isEmpty() || idade.isEmpty()) {
            Toast.makeText(this, "Preencha todos os dados!", Toast.LENGTH_SHORT).show();
            return;
        }


        // Salva os dados no SharedPreferences
        SharedPreferences preferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("nome", nome);
        editor.putString("altura", altura);
        editor.putString("peso", peso);
        editor.putString("idade", idade);
        editor.putString("Dias da Semana", diasSemana);
        editor.putString("sexo", sexo);

        editor.putBoolean("isUserDataComplete", true);
        editor.apply();

        // Redireciona para a home
        Intent intent = new Intent(CadastroActivity.this, MainActivity.class);
        startActivity(intent);
        finish();


    }


}