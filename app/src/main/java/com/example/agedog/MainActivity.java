package com.example.agedog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtIdadeCao;
    private Button btnCalcular;
    private TextView txtIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIdadeCao = (EditText) findViewById(R.id.txtIdadeCao);
        txtIdade = (TextView) findViewById(R.id.txtIdadeHumano);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idadeCao = Integer.parseInt(txtIdadeCao.getText().toString());
                int idade = idadeCao * 7;
                txtIdade.setText("A idade do seu cachorro em anos humanos é: " + idade);
            }
        });
    }
}
