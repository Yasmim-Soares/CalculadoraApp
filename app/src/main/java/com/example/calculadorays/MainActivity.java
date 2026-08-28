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
    Button btnSomar, btnSubtrair, btnDividir, btnFatorar, btnMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ednumero1 = findViewById(R.id.ednumero1);
        ednumero2 = findViewById(R.id.ednumero2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnDividir = findViewById(R.id.btnDividir);
        btnFatorar = findViewById(R.id.btnFatorar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);

        if (ednumero2.getText().toString().isEmpty() || ednumero1.getText().toString().isEmpty()) {
            AlertDialog.Builder dialogo = new
                    AlertDialog.Builder(MainActivity.this);
            dialogo.setMessage("Números não podem ser vazios");
        }

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

        btnSubtrair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double subtrair = num1 - num2;

                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da subtração");
                dialogo.setMessage("A subtração é " + subtrair);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double multiplicar = num1 * num2;

                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da multiplicação: ");
                dialogo.setMessage("A multiplicação é " + multiplicar);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                if (num1 == 0 || num2 == 0) {
                    AlertDialog.Builder dialogo = new
                            AlertDialog.Builder(MainActivity.this);
                    dialogo.setMessage("Qualque número dividido por 0 é igual a 0.");
                    dialogo.setNeutralButton("Ok", null);
                    dialogo.show();
                }

                double dividir = num1 / num2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da divisão: ");
                dialogo.setMessage("A divisão é: " + dividir);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

        btnFatorar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double num1 = Double.parseDouble(ednumero1.getText().toString());

                double fatorar = 0;
                for (double i = num1; i > 1; i--){
                    fatorar = fatorar * i;
                }


                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da fatoração");
                dialogo.setMessage("A fatoração é " + fatorar);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

    }
}