package com.example.sala_bd.class2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String palabra = getIntent().getStringExtra("llaveTexto");
        TextView tv = new TextView(this);
        tv.setText(palabra);
        linear = (LinearLayout) findViewById(R.id.layoutID);
        linear.addView(tv);
    }
}
