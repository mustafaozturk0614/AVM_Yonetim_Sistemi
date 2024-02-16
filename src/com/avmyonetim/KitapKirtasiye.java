package com.avmyonetim;

public class KitapKirtasiye extends Magaza implements IStok{
        private  int rafSayisi;

    public KitapKirtasiye() {
    }

    public KitapKirtasiye(int id, String ad, String tur, int katNo, int rafSayisi) {
        super(id, ad, tur, katNo);
        this.rafSayisi = rafSayisi;
    }

    public int getRafSayisi() {
        return rafSayisi;
    }

    public void setRafSayisi(int rafSayisi) {
        this.rafSayisi = rafSayisi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("KitapKirtasiye{");
        sb.append("rafSayisi=").append(rafSayisi);
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
