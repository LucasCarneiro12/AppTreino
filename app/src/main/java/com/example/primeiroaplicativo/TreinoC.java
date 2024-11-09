package com.example.primeiroaplicativo;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class TreinoC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_treino_c);

        //remanda com hack
        ImageView hack = findViewById(R.id.gif_hack);
        Glide.with(this).asGif().load(R.drawable.hack).into(hack);

        // leg press
        ImageView leg = findViewById(R.id.gif_legpress);
        Glide.with(this).asGif().load(R.drawable.legpress).into(leg);

        // cadeira extensora
        ImageView extensora = findViewById(R.id.gif_cadeiraextensora);
        Glide.with(this).asGif().load(R.drawable.cardeiraextensora).into(extensora);

        // cadeira flexora
        ImageView cadeiraflexora = findViewById(R.id.gif_cadeiraflexora);
        Glide.with(this).asGif().load(R.drawable.cadeiraflexora).into(cadeiraflexora);

        // mesa flexora
        ImageView mesaflexora = findViewById(R.id.gif_mesaflexora);
        Glide.with(this).asGif().load(R.drawable.mesaflexora).into(mesaflexora);

        // stiff
        ImageView stiff = findViewById(R.id.gif_stiff);
        Glide.with(this).asGif().load(R.drawable.stif).into(stiff);

        // panturrilha
        ImageView panturrilha = findViewById(R.id.gif_panturrilhamaq);
        Glide.with(this).asGif().load(R.drawable.panturrilhamaquina).into(panturrilha);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}