package com.example.calculadora;

import android.content.Intent;
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

public class CalculaActivity extends AppCompatActivity implements View.OnClickListener {

    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calcula);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);

        TextView tvTitulo = findViewById(R.id.tvTitulo);

        String titulo = getIntent().getStringExtra("operacao");
        operacao = titulo;
        tvTitulo.setText(operacao.concat( "Números"));
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnVoltar) {
            finish();
        } else if (view.getId() == R.id.btnCalcular) {
            calcular();
        }
    }

    private void calcular() {
        EditText etNumero1 = findViewById(R.id.etNumero1);
        EditText etNumero2 = findViewById(R.id.etNumero2);

        int n1 = Integer.parseInt(etNumero1.getText().toString());
        int n2 = Integer.parseInt(etNumero2.getText().toString());

        int resultado = 0;

        switch (operacao) {
            case "Somar":
                resultado = n1 + n2;
                break;
            case "Subtrair":
                resultado = n1 - n2;
                break;
            case "Multiplicar":
                resultado = n1 * n2;
                break;
            case "Dividir":
                resultado = n1 / n2;
                break;
        }

        Toast.makeText(CalculaActivity.this,
                "Resultado: ".concat(String.valueOf(resultado)),
                Toast.LENGTH_LONG)
                .show();
    }
}