package com.penjualan.nasigoreng;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;

public class ListNasiGorengAdapter extends RecyclerView.Adapter<ListNasiGorengAdapter.ListViewHolder>
{
    Context context;
    private ArrayList<NasiGoreng> listNasiGoreng;
    public OnItemClickCallback onItemClickCallback;

    public interface OnItemClickCallback {
        void onItemClicked(NasiGoreng nasigoreng);
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback2) {
        this.onItemClickCallback = onItemClickCallback2;
//        this.context = this.context;
    }

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
                holder.btn_move.setOnClickListener(view -> ListNasiGorengAdapter.this.onItemClickCallback.onItemClicked(ListNasiGorengAdapter.this.listNasiGoreng.get(holder.getAdapterPosition())));
        holder.binding(this.listNasiGoreng.get(position));
    }

    @Override
    public int getItemCount() {
        return listNasiGoreng.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgNasiGoreng;
        TextView nasi_goreng_text, details;
        Button btn_move;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgNasiGoreng = itemView.findViewById(R.id.img_item);
            nasi_goreng_text = itemView.findViewById(R.id.item_name_text);
            details = itemView.findViewById(R.id.detail);
            btn_move = itemView.findViewById(R.id.lebih_lanjut);
        }

        public void binding(final NasiGoreng nasiGoreng)
        {
            this.imgNasiGoreng.setImageResource(nasiGoreng.getImg_nasgor());
            this.nasi_goreng_text.setText(nasiGoreng.getNama_nasi_goreng());
            this.details.setText(nasiGoreng.getDetail());
            this.btn_move.setOnClickListener(view -> {
                Intent s = new Intent(ListViewHolder.this.itemView.getContext(), NasiGorengDetail.class);
                s.putExtra(NasiGorengDetail.NAME_FOOD, nasiGoreng.getNama_nasi_goreng());
                s.putExtra(NasiGorengDetail.DETAIL_FOOD, nasiGoreng.getDetail());
                s.putExtra("img_item", nasiGoreng.getImg_nasgor());
                s.putExtra(NasiGorengDetail.PRICE, nasiGoreng.getPrice());
                s.putExtra(NasiGorengDetail.PARSEINTPRICE, nasiGoreng.getPriceInt());
                ListViewHolder.this.btn_move.getContext().startActivity(s);
            });
        }
    }
}
