package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
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

        //problem start here!
//        Button btnMoveWithDataActivity = findViewById(R.id.btn_detail_move);
//        btnMoveWithDataActivity.setOnClickListener(this);

    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_detail_move:
//                Intent move_data = new Intent(MainActivity.this, NasiGorengDetail.class);
//                move_data.putExtra(NasiGorengDetail.NAME_FOOD, R.id.name_food);
//                move_data.putExtra(NasiGorengDetail.DETAIL_FOOD, R.id.detail_food);
//                move_data.putExtra(NasiGorengDetail.IMG_ITEM, R.id.img_item);
//                startActivity(move_data);
                break;
        }
    }

    private void showRecyclerList()
    {
        rvNasiGoreng.setLayoutManager(new LinearLayoutManager(this));
        ListNasiGorengAdapter listnasigorengadapter = new ListNasiGorengAdapter(list);
        rvNasiGoreng.setAdapter(listnasigorengadapter);
    }
}