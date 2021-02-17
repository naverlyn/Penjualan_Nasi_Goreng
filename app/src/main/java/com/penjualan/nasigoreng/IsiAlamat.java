package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class IsiAlamat extends AppCompatActivity{

    String name = "Isi Alamat";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_alamat);
        setActionBar(this.name);
        Button thanks = (Button) findViewById(R.id.beli_sekarang_btn);
        thanks.setOnClickListener(View -> showTerimaKasih());
    }

    private void setActionBar(String name)
    {
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle((CharSequence) name);
        }
    }

    void showTerimaKasih()
    {
//        if (inputHarga.getText().toString().trim().length() <= 0)
//        {
//            Toast.makeText(this, "It's empty", Toast.LENGTH_SHORT).show();
//        }
//        else
//        {
//            h = Integer.parseInt(harga_asli.getText().toString());
//            ih = Integer.parseInt(inputHarga.getText().toString());
//            tt = h*ih;
//            showHarga.setText("Rp." + tt + ",-");
//        }
        Intent s = new Intent(this, TerimaKasih.class);
        startActivity(s);
    }
}