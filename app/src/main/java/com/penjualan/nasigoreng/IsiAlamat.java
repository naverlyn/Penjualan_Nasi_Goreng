package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
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
        AlertDialog.Builder dialogBuild = new AlertDialog.Builder(this);
        dialogBuild.setTitle("Perhatian!");
        dialogBuild
                .setMessage("Apakah alamat yang sudah tertera sudah benar?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent s = new Intent(IsiAlamat.this, TerimaKasih.class);
                        startActivity(s);
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog dialog = dialogBuild.create();
        dialog.show();
    }

    private void showanjay()
    {
        Intent z = new Intent(this, TerimaKasih.class);
        startActivity(z);
    }
}