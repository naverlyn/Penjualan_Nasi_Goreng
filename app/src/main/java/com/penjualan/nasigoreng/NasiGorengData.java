package com.penjualan.nasigoreng;


import java.util.ArrayList;

public class NasiGorengData
{
    private static String[] NasiGorengName =
            {
                    "Nasi Goreng Jawa",
                    "Nasi Goreng Cirebon with Katsu",
                    "Nasi Goreng Jakarta Selatan",
                    "Nasi Goreng Solo",
                    "Nasi Goreng Aceh"
            };

    private static String[] details =
            {
                    "Nasi Goreng Jawa memiliki cita rasa unik",
                    "Ini juga, tapi ngapak bahasanya. cuman dimodif tambah katsu doang, tapi enak ngl.",
                    "yo this is nasgor jaksel which is enak banget kalo you want to try this. you'll not regret when read this text.",
                    "ENAAAAAAAAAAAAAAK",
                    "ENNNAAAAAAAAAKKKKKKKKKKKKK"
            };

    private static int[] imgNasiGoreng =
            {
                    R.drawable.nasi_goreng_jawa,
                    R.drawable.nasi_goreng_cirebon_katsu,
                    R.drawable.nasi_goreng_jaksel,
                    R.drawable.nasi_goreng_solo,
                    R.drawable.nasi_goreng_aceh
            };

    static ArrayList<NasiGoreng> getListData()
    {
        ArrayList<NasiGoreng> list = new ArrayList<>();
        for (int pos = 0; pos < NasiGorengName.length; pos++)
        {
            NasiGoreng nasigoreng = new NasiGoreng();
            nasigoreng.setNasi_goreng_name(NasiGorengName[pos]);
            nasigoreng.setDetail(details[pos]);
            nasigoreng.setImg_nasgor(imgNasiGoreng[pos]);
            list.add(nasigoreng);
        }
        return list;
    }
}
