package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private static final String LOGTAG ="INFORMACION";
    TextView tvSaludo;
    Button btnSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a=5;
        int b=10;
        Log.i(LOGTAG,"holii mundirri!!");
        Log.i(LOGTAG,"el valor de a es: "+ a);
        Log.i(LOGTAG,"el valor de b es: "+ b);
        Log.i(LOGTAG,"el valor de a+b es: "+ (a+b));
        tvSaludo = findViewById(R.id.tvSaludo);
        btnSaludar = findViewById(R.id.btnSaludar);

        //tvSaludo.setText("computo movil"); // cambias texto con el metodo setText aunque este definicdo en el lay out con otro texto, lo vera el usuario, estas hardcodeando de esta manera
        //tvSaludo.setText(getResources().getString(R.string.app_name));//lo mismo de arriba pero sin hardcodear
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             tvSaludo.setText("hola mich");
            }
        });
        tvSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             tvSaludo.setText("holi mundo");
            }
        });
    }
}