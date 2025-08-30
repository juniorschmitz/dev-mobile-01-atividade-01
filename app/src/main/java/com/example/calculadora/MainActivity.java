package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnViagem = findViewById(R.id.btnViagem);
        btnViagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viagemView = new Intent (MainActivity.this, ViagemActivity.class);
                startActivity(viagemView);
                finish();
            }
        });

        Button btnEntrar = findViewById(R.id.btnCalculadora);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abrir a tela Home do App
                Intent homeView = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeView);
                finish();
            }
        });
    }
}