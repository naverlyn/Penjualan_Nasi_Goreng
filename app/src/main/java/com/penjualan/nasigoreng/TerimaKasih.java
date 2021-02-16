package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TerimaKasih extends AppCompatActivity {
    String title = "Terima Kasih";
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terimakasih);
        setActionBar(this.title);
        back = findViewById(R.id.back_to_homepage);
        back.setOnClickListener(View -> balik());
    }

    private void setActionBar(String title)
    {
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle((CharSequence) title);
        }
    }
    private void balik()
        {
            Intent b = new Intent(this, MainActivity.class);
            startActivity(b);
        }
}