package com.example.luask_keliling_segitiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextAlas, editTextTinggi;
    private Button buttonHitung;
    private TextView textViewHasilLuas, textViewHasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasilLuas = findViewById(R.id.textViewHasilLuas);
        textViewHasilKeliling = findViewById(R.id.textViewHasilKeliling);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alas = Double.parseDouble(editTextAlas.getText().toString());
                double tinggi = Double.parseDouble(editTextTinggi.getText().toString());

                double luas = 0.5 * alas * tinggi;
                double keliling = alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));

                textViewHasilLuas.setText("Luas segitiga: " + luas);
                textViewHasilKeliling.setText("Keliling segitiga: " + keliling);
            }
        });
    }
}