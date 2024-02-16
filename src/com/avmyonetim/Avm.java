package com.avmyonetim;

import java.util.Arrays;

public class Avm {
    private  int id;
    private String ad;
    private String adres;
    private  int magzaKapasitesi;
    private  Magaza [] magazalar;
    public  static  int magazaSayisi;

    public Avm(int id, String ad, String adres ,int magzaKapasitesi) {
        this.id = id;
        this.ad = ad;
        this.adres = adres;
        this.magzaKapasitesi=magzaKapasitesi;
        magazalar=new Magaza[magzaKapasitesi];
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMagzaKapasitesi() {
        return magzaKapasitesi;
    }

    public void setMagzaKapasitesi(int magzaKapasitesi) {
        this.magzaKapasitesi = magzaKapasitesi;
    }

    public Magaza[] getMagazalar() {
        return magazalar;
    }

    public void setMagazalar(Magaza[] magazalar) {
        this.magazalar = magazalar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Avm{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", magzaKapasitesi=").append(magzaKapasitesi);
        sb.append(", magazalar=").append(Arrays.toString(magazalar));
        sb.append('}');
        return sb.toString();
    }
}
