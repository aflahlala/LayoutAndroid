package com.example.acer.jobsheet1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView txtHelo;
    Button btBack;
    String nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtHelo = (TextView) findViewById(R.id.HeloUser);

        Intent i = getIntent();
        Bundle extras = getIntent().getExtras();
        nama = i.getStringExtra("nama");
        txtHelo.setText(nama);

        btBack = (Button) findViewById(R.id.BtBack);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}
