package com.example.primeiroaplicativo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Info1 extends AppCompatActivity {


    private EditText editPeso, editAltura;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info1);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void calcular(View view){

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        double imc = peso / (altura * altura);
        /*IMC == peso / altura * altura*/
        String imcFormatado = String.format("%.2f", imc);

        if(imc >= 18.5 && imc <= 24.99){
            textResultado.setText("Peso normal. IMC= "+imcFormatado);
        }
        else if(imc >= 25 && imc <= 29.99){
            textResultado.setText("Acima do peso. IMC= "+imcFormatado);
        }
        else if(imc >= 30 && imc <= 34.99){
            textResultado.setText("Obesidade I. IMC= "+imcFormatado);
        }
        else if(imc >= 35 && imc <= 39.99){
            textResultado.setText("Obesidade II(severa). IMC= "+imcFormatado);
        }
        else if(imc >= 40){
            textResultado.setText("Obesidade III (mórbida). IMC= "+imcFormatado);
        }
        else if(imc < 18.5){
            textResultado.setText("Abaixo do peso. IMC= "+imcFormatado);
        }

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