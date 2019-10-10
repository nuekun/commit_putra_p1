package com.nuedevlop.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView txtTampil;
  EditText txtInput;
  Button btnTampil;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = findViewById(R.id.txtTampil);
        txtInput = findViewById(R.id.txtInput);
        btnTampil = findViewById(R.id.btnTampil);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // mengambil Value text dari EditText dan TeztView
               String a = txtInput.getText().toString();
               String b = txtTampil.getText().toString();
                // mengkorversi string menjadi integer kemudian menjumlahkannya
               int input = Integer.parseInt(a);
               int tampil = Integer.parseInt(b);
               int jumlah = input+tampil;
                // mengubah value dari TextView menjadi hasil dari penjumlahan tadi
               txtTampil.setText(String.valueOf(jumlah));

            }
        });



    }
}
