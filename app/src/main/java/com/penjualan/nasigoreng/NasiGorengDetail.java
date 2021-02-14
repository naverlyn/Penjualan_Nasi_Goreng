package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NasiGorengDetail extends AppCompatActivity {
    public static String NAME_FOOD = "name_food";
    public static String DETAIL_FOOD = "detail_food";
    public static String IMG_ITEM = "img_item";
    public static String PRICE = "price";

    TextView detailed;
    ImageView imgs;
    TextView nameNasgor;
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nasi_goreng_detail);
        //setActionBar(this.getTitle());
        int image = getIntent().getIntExtra("img_item", 0);
        String name = getIntent().getStringExtra(NAME_FOOD);
        String detail = getIntent().getStringExtra(DETAIL_FOOD);
        String price = getIntent().getStringExtra(PRICE);
        this.imgs = (ImageView) findViewById(R.id.img_name_get);
        this.nameNasgor = (TextView) findViewById(R.id.nasgor_name_get);
        this.detailed = (TextView) findViewById(R.id.deskripsi);
        this.price = (TextView) findViewById(R.id.harga_get);
        this.imgs.setImageResource(image);
        this.nameNasgor.setText(name);
        this.detailed.setText(detail);
        this.price.setText(price);
        Button s = (Button) findViewById(R.id.btn_beli);
        s.setOnClickListener(view -> showBeli());
    }
    public void showBeli()
    {
        Intent y = new Intent(this, BeliLayout.class);
        y.putExtra(BeliLayout.NAME_FOOD, R.id.nasgor_name_get);
        //y.putExtra("img_item", nasiGoreng.getImg_nasgor());
        y.putExtra(BeliLayout.PRICE, R.id.harga_get);
        startActivity(y);
    }
}