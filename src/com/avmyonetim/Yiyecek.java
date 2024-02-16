package com.avmyonetim;

import java.util.Arrays;

public class Yiyecek extends Magaza{
private  int masaSayisi;
private String [] menu;

    public Yiyecek() {
    }

    public Yiyecek(int id, String ad, String tur, int katNo, int masaSayisi, String[] menu) {
        super(id, ad, tur, katNo);
        this.masaSayisi = masaSayisi;
        this.menu = menu;
    }

    public Yiyecek(int id ,String ad, String tur, int katNo, int masaSayisi) {
        super(id,ad, tur, katNo);
        this.masaSayisi = masaSayisi;
    }

    public int getMasaSayisi() {
        return masaSayisi;
    }

    public String[] getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Yiyecek{");
        sb.append("masaSayisi=").append(masaSayisi);
        sb.append(", menu=").append(Arrays.toString(menu));
        sb.append(", id=").append(getId());
        sb.append(", ad='").append(getAd()).append('\'');
        sb.append(", tur='").append(getTur()).append('\'');
        sb.append(", katNo=").append(getKatNo());
        sb.append('}');
        return sb.toString();
    }

    public void menuGoster() {
        System.out.println("Menu");
        for (String  m:menu){
            if (m!=null){
                System.out.println(menu);
            }
        }
    }

    public void menuOlustur() {
        System.out.println("menu olsuturluyor");

    }
}

