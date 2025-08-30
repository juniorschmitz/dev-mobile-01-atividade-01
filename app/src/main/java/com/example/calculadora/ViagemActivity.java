package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ViagemActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_viagem);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnVoltarHome = findViewById(R.id.btnVoltarHome);
        btnVoltarHome.setOnClickListener(this);

        Button btnCalcularViagem = findViewById(R.id.btnCalcularViagem);
        btnCalcularViagem.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnVoltarHome) {
            finish();
        } else if (view.getId() == R.id.btnCalcularViagem) {
            calcular();
        }
    }

    private void calcular() {
        EditText etDistancia = findViewById(R.id.etDistancia);
        EditText etValorCombustivel = findViewById(R.id.etValorCombustivel);
        EditText etMediaLitro = findViewById(R.id.etMediaLitro);

        int distancia = Integer.parseInt(etDistancia.getText().toString());
        int valorCombustivel = Integer.parseInt(etValorCombustivel.getText().toString());
        int mediaLitro = Integer.parseInt(etMediaLitro.getText().toString());

        int resultado = 0;

        int litrosNecessarios = distancia / mediaLitro;
        resultado = litrosNecessarios * valorCombustivel;

        Toast.makeText(ViagemActivity.this,
                        "Resultado: ".concat(String.valueOf(resultado)),
                        Toast.LENGTH_LONG)
                        .show();
    }
}