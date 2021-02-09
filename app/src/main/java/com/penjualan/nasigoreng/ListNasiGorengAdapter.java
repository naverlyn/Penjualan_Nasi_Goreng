package com.penjualan.nasigoreng;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListNasiGorengAdapter extends RecyclerView.Adapter<ListNasiGorengAdapter.ListViewHolder>
{
    private ArrayList<NasiGoreng> listNasiGoreng;

    public ListNasiGorengAdapter(ArrayList<NasiGoreng> list)
    {
        this.listNasiGoreng = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_nasi_goreng, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        NasiGoreng nasigoreng = listNasiGoreng.get(position);
        Glide.with(holder.itemView.getContext())
                .load(nasigoreng.getImg_nasgor())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgNasiGoreng);
                holder.nasi_goreng_text.setText(nasigoreng.getNama_nasi_goreng());
                holder.details.setText(nasigoreng.getDetail());
    }

    @Override
    public int getItemCount() {
        return listNasiGoreng.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgNasiGoreng;
        TextView nasi_goreng_text, details;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgNasiGoreng = itemView.findViewById(R.id.img_item);
            nasi_goreng_text = itemView.findViewById(R.id.item_name_text);
            details = itemView.findViewById(R.id.detail);
        }
    }
}
