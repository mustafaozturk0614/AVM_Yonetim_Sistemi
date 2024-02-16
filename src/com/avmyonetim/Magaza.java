package com.avmyonetim;

import java.util.Scanner;

public abstract class Magaza implements IMagaza{
    private int id;
    private String ad;
    private String tur;
    private int katNo;

    public Magaza() {
    }

    public Magaza(int id, String ad, String tur, int katNo) {
        this.id=id;
        this.ad = ad;
        this.tur = tur;
        this.katNo = katNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getKatNo() {
        return katNo;
    }

    public void setKatNo(int katNo) {
        this.katNo = katNo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magaza{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", tur='").append(tur).append('\'');
        sb.append(", katNo=").append(katNo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void urunSat() {
        System.out.println("Urun Satıldı");
    }

    @Override
    public void urunAl() {
        System.out.println("urun Alındı");
    }

    @Override
    public void mesaiSaatiBelirle() {
        System.out.println("Mesai saatleri belirlendi");
    }

    @Override
    public void veriAl() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir id giriniz");
        this.id=Integer.parseInt(scanner.nextLine());
        System.out.println("Lutfen bir isim giriniz");
        this.ad=scanner.nextLine();
        System.out.println("Lutfen bir kat no giriniz");
        this.katNo=Integer.parseInt(scanner.nextLine());

    }



}
