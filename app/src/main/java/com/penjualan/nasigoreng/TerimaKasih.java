package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TerimaKasih extends AppCompatActivity {
    String title = "Terima Kasih";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terimakasih);
        setActionBar(this.title);
    }

    private void setActionBar(String title)
    {
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle((CharSequence) title);
        }
    }
}