package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IsiAlamat extends AppCompatActivity
{
    String name = "Isi Alamat";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_alamat);
        setActionBar(this.name);
        Button thanks = (Button) findViewById(R.id.beli_sekarang_btn);
        thanks.setOnClickListener(View -> showDialogCustom());
    }

    private void setActionBar(String name)
    {
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle((CharSequence) name);
        }
    }

    void showDialogCustom()
    {
        EditText fromAtasNama, fromAlamat, fromKelurahan;
        TextView getAtasNama, getAlamat, getKelurahan;
        fromAtasNama = (EditText) findViewById(R.id.atas_nama);
        fromAlamat = (EditText) findViewById(R.id.alamat_text);
        fromKelurahan = (EditText) findViewById(R.id.kelurahan_text);


        getAtasNama = (TextView) findViewById(R.id.getAtasNama);
        getAlamat = (TextView) findViewById(R.id.getAlamat);
        getKelurahan = (TextView) findViewById(R.id.getKelurahan);

        final Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.dialog_hmm);
        Button dialogbtncancel = dialog.findViewById(R.id.cancel_btn);
        dialogbtncancel.setOnClickListener(view -> dialog.dismiss());
        Button dialogbtnyes = dialog.findViewById(R.id.yes_btn);
        dialogbtnyes.setOnClickListener(view -> showanjay());
        dialog.show();
    }

    private void showanjay()
    {
        Intent z = new Intent(this, TerimaKasih.class);
        startActivity(z);
    }
}