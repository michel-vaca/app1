package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView tvSaludo;
    Button btnSaludar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvSaludo = findViewById(R.id.tvSaludo);
        btnSaludar = findViewById(R.id.btnSaludar);
        tvSaludo.setOnClickListener(this);
        btnSaludar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnSaludar:
                tvSaludo.setText("hola mich");
                break;
            case R.id.tvSaludo:
                tvSaludo.setText("holi mundo");
            default:
                break;
        }
    }
}