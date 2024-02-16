package com.avmyonetim;

public class Giyim extends Magaza implements IStok{

    private int denemeKabinSayisi;
    private int askiSayisi;

    public Giyim() {
    }

    public Giyim(int id, String ad, String tur, int katNo, int denemeKabinSayisi, int askiSayisi) {
        super(id, ad, tur, katNo);
        this.denemeKabinSayisi = denemeKabinSayisi;
        this.askiSayisi = askiSayisi;
    }



    public int getDenemeKabinSayisi() {
        return denemeKabinSayisi;
    }

    public void setDenemeKabinSayisi(int denemeKabinSayisi) {
        this.denemeKabinSayisi = denemeKabinSayisi;
    }

    public int getAskiSayisi() {
        return askiSayisi;
    }

    public void setAskiSayisi(int askiSayisi) {
        this.askiSayisi = askiSayisi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Giyim{");
        sb.append("denemeKabinSayisi=").append(denemeKabinSayisi);
        sb.append(", askiSayisi=").append(askiSayisi);
        sb.append(", id=").append(getId());
        sb.append(", ad='").append(getAd()).append('\'');
        sb.append(", tur='").append(getTur()).append('\'');
        sb.append(", katNo=").append(getKatNo());
        sb.append('}');
        return sb.toString();
    }
    @Override
    public void stokTakip() {
        System.out.println("Stok takibi yapıldı");
    }
}
