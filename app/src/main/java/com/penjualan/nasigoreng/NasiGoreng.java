package com.penjualan.nasigoreng;

public class NasiGoreng
{
    private String nasi_goreng_name;
    private String detail;
    private String price;
    private String priceInt;
    private int img_nasgor;

    public String getNama_nasi_goreng() {
        return nasi_goreng_name;
    }

    public void setNasi_goreng_name(String nasi_goreng_name) {
        this.nasi_goreng_name = nasi_goreng_name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImg_nasgor() {
        return img_nasgor;
    }

    public void setImg_nasgor(int img_nasgor) {
        this.img_nasgor = img_nasgor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceInt() {
        return priceInt;
    }

    public void setPriceInt(String priceInt) {
        this.priceInt = priceInt;
    }
}
