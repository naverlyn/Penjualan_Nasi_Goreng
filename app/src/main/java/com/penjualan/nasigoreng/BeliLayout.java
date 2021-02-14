package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BeliLayout extends AppCompatActivity {
    public static String NAME_FOOD = "name_food";
    public static String IMG_ITEM = "img_item";
    public static String PRICE = "price";

    ImageView images;
    TextView nasgorGet;
    TextView price_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beli_layout);
        int image = getIntent().getIntExtra("img_item", 0);
        String name = getIntent().getStringExtra(NAME_FOOD);
        String price = getIntent().getStringExtra(PRICE);
        this.images = (ImageView) findViewById(R.id.image_buy_get);
        this.nasgorGet = (TextView) findViewById(R.id.beli_nasgor_name);
        this.price_get = (TextView) findViewById(R.id.harga_beli);
        this.images.setImageResource(image);
        this.nasgorGet.setText(name);
        this.price_get.setText(price);
    }
}