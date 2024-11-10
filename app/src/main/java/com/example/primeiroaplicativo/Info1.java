package com.example.primeiroaplicativo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Info1 extends AppCompatActivity {


    private EditText editPeso, editAltura, editIdade;
    private TextView textResultado, textResultadoTMB;
    private CheckBox checkBoxMasculino;
    private CheckBox checkBoxFeminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info1);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        editIdade = findViewById(R.id.editIdade);
        textResultado = findViewById(R.id.textResultado);
        checkBoxMasculino = findViewById(R.id.checkBoxMasculino);
        checkBoxFeminino = findViewById(R.id.checkBoxFeminino);
        textResultadoTMB = findViewById(R.id.textResultadoTMB);

        // Controla os CheckBox para que apenas um seja selecionado
        checkBoxMasculino.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) checkBoxFeminino.setChecked(false);
        });
        checkBoxFeminino.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) checkBoxMasculino.setChecked(false);
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void calcular(View view){

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double idade = Double.parseDouble(editIdade.getText().toString());

        // IMC
        double imc = peso / ((altura/100) * (altura/100));
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

        // TMB

        String pesoStr = editPeso.getText().toString();
        String alturaStr = editAltura.getText().toString();
        String idadeStr = editIdade.getText().toString();

        // Verifica se os campos estão preenchidos
        if (pesoStr.isEmpty() || alturaStr.isEmpty() || idadeStr.isEmpty()) {
            textResultadoTMB.setText("Por favor, preencha todos os campos.");
            return;
        }

        // Converte os valores para double/int
        /*double peso = Double.parseDouble(pesoStr);
        double altura = Double.parseDouble(alturaStr);
        int idade = Integer.parseInt(idadeStr);*/

        double tmb;

        if (checkBoxMasculino.isChecked()) {
            // Calcula TMB para homens
            tmb = 88.36 + (13.4 * peso) + (4.8 * altura) - (5.7 * idade);
        } else if (checkBoxFeminino.isChecked()) {
            // Calcula TMB para mulheres
            tmb = 447.6 + (9.2 * peso) + (3.1 * altura) - (4.3 * idade);
        } else {
            // Caso nenhum sexo tenha sido selecionado
            textResultadoTMB.setText("Selecione um sexo.");
            return;
        }

        // Exibe o resultado formatado com duas casas decimais
        String resultado = String.format("Sua TMB é: %.2f kcal/dia", tmb);
        textResultadoTMB.setText(resultado);
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