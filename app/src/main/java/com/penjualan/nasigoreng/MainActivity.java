package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
//    private Button btn_move;
    private RecyclerView rvNasiGoreng;
    private ArrayList<NasiGoreng> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNasiGoreng = findViewById(R.id.nasi_goreng_layout);
        rvNasiGoreng.setHasFixedSize(true);
        list.addAll(NasiGorengData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList()
    {
        rvNasiGoreng.setLayoutManager(new LinearLayoutManager(this));
        ListNasiGorengAdapter listnasigorengadapter = new ListNasiGorengAdapter(list);
        rvNasiGoreng.setAdapter(listnasigorengadapter);
    }
}