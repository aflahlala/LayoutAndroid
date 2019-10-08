package com.example.acer.jobsheet1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.Key;

public class Main2Activity extends AppCompatActivity {
    EditText edtNim, edtNama;
    Button BtEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtNim = findViewById(R.id.edtNim);
        edtNama = findViewById(R.id.edtNama);

        BtEnter = (Button) findViewById(R.id.BtEnter);
        BtEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = edtNama.getText().toString();
                String nim = edtNim.getText().toString();
                Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                i.putExtra("nama", nama);
                i.putExtra("nim", nim);
                startActivity(i);
            }
        });}
}
