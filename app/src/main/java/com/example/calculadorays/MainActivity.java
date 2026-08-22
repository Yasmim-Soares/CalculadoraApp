package com.example.calculadorays;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText ednumero1, ednumero2;
    Button btnSomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ednumero1 = findViewById(R.id.ednumero1);
        ednumero2 = findViewById(R.id.ednumero2);
        btnSomar = findViewById(R.id.btnSomar);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                double soma = num1 + num2;

                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da soma");
                dialogo.setMessage("A soma é " + soma);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();

            }
        });
    }
}