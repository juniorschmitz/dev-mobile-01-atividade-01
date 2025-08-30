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

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnSomar = findViewById(R.id.btnSomar);
        btnSomar.setOnClickListener(this);

        Button btnSubtrair = findViewById(R.id.btnSubtrair);
        btnSubtrair.setOnClickListener(this);

        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(this);

        Button btnDividir = findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent telaCalcula = new Intent(HomeActivity.this, CalculaActivity.class);

        if (view.getId() == R.id.btnSomar) {
            telaCalcula.putExtra("operacao", "somar");
        } else if (view.getId() == R.id.btnSubtrair) {
            telaCalcula.putExtra("operacao", "subtrair");
        } else if (view.getId() == R.id.btnMultiplicar) {
            telaCalcula.putExtra("operacao", "multiplicar");
        } else if (view.getId() == R.id.btnDividir) {
            telaCalcula.putExtra("operacao", "dividir");
        }

        startActivity(telaCalcula);
    }
}