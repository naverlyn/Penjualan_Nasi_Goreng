package com.penjualan.nasigoreng;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NasiGorengDetail extends AppCompatActivity{
    public static String NAME_FOOD = "name_food";
    public static String DETAIL_FOOD = "detail_food";
    public static String PRICE = "price";
    public static String PARSEINTPRICE = "parse_int_price";

    TextView detailed;
    ImageView imgs;
    TextView nameNasgor;
    TextView price;
    TextView parseIntPrice;

    String titles = "Detail Nasi Goreng";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nasi_goreng_detail);
        setActionBar(this.titles);
        int image = getIntent().getIntExtra("img_item", 0);
        String name = getIntent().getStringExtra(NAME_FOOD);
        String detail = getIntent().getStringExtra(DETAIL_FOOD);
        String price = getIntent().getStringExtra(PRICE);
        String parsePrice = getIntent().getStringExtra(PARSEINTPRICE);
        this.imgs = (ImageView) findViewById(R.id.img_name_get);
        this.nameNasgor = (TextView) findViewById(R.id.nasgor_name_get);
        this.detailed = (TextView) findViewById(R.id.deskripsi);
        this.price = (TextView) findViewById(R.id.harga_get);
        this.parseIntPrice = (TextView) findViewById(R.id.parseInt);
        this.imgs.setImageResource(image);
        this.nameNasgor.setText(name);
        this.detailed.setText(detail);
        this.price.setText(price);
        this.parseIntPrice.setText(parsePrice);
        Button s = (Button) findViewById(R.id.btn_beli);
        s.setOnClickListener(view -> showBeli());
        Button f = (Button) findViewById(R.id.totalkan);
        f.setOnClickListener(view -> showD());
        Button k = (Button) findViewById(R.id.btn_checkout);
        k.setOnClickListener(view -> showTerimakasih());
    }

    private void setActionBar(String titles)
    {
        if(getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle((CharSequence) titles);
        }
    }

    public void showBeli()
    {
        TextView beli = null;
        Button btn_checkout = null;
        EditText editText = null;
        beli = findViewById(R.id.beli_text_only);
        btn_checkout = findViewById(R.id.totalkan);
        editText = findViewById(R.id.input_beli);
        beli.setVisibility(View.VISIBLE);
        btn_checkout.setVisibility(View.VISIBLE);
        editText.setVisibility(View.VISIBLE);
    }

    public void showD()
    {
        TextView totalbayartext = null;
        TextView showHarga = null;
        TextView harga_asli;
        EditText inputHarga;
        Button checkout = null;
        int h, ih, tt;
        inputHarga = findViewById(R.id.input_beli);
        totalbayartext = findViewById(R.id.total_bayar_text);
        harga_asli = findViewById(R.id.parseInt);
        checkout = findViewById(R.id.btn_checkout);
        h = Integer.parseInt(harga_asli.getText().toString());
        ih = Integer.parseInt(inputHarga.getText().toString());
        tt = h*ih;
        showHarga = findViewById(R.id.show_harga);
        showHarga.setText("Rp." + tt + ",-");
        showHarga.setVisibility(View.VISIBLE);
        totalbayartext.setVisibility(View.VISIBLE);
        checkout.setVisibility(View.VISIBLE);
    }

    public void showTerimakasih()
    {

    }
}