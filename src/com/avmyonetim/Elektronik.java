package com.avmyonetim;

public class Elektronik extends Magaza implements IStok{
    private  int teknikServisSayisi;
    private  boolean urunMontajVarmi;

    public Elektronik() {
    }

    public Elektronik(int id, String ad, String tur, int katNo, int teknikServisSayisi, boolean urunMontajVarmi) {
        super(id, ad, tur, katNo);
        this.teknikServisSayisi = teknikServisSayisi;
        this.urunMontajVarmi = urunMontajVarmi;
    }



    public int getTeknikServisSayisi() {
        return teknikServisSayisi;
    }

    public void setTeknikServisSayisi(int teknikServisSayisi) {
        this.teknikServisSayisi = teknikServisSayisi;
    }

    public boolean isUrunMontajVarmi() {
        return urunMontajVarmi;
    }

    public void setUrunMontajVarmi(boolean urunMontajVarmi) {
        this.urunMontajVarmi = urunMontajVarmi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elektronik{");
        sb.append("teknikServisSayisi=").append(teknikServisSayisi);
        sb.append(", urunMontajVarmi=").append(urunMontajVarmi);
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
