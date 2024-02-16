package com.avmyonetim;

import java.util.Scanner;

public class AvmManager {

    private  Avm avm;
    Scanner scanner=new Scanner(System.in);

    public AvmManager(Avm avm) {
        this.avm = avm;
    }
    public  void  uygulama(){
        int secim;
        do {
            anaMenu();
            secim = secimYap();
            anaIslemler(secim);
        }while (secim!=0);
    }
    public void anaMenu(){
        System.out.println("===AVM YONETİM SİSTEMİ===");
        System.out.println("1-Magaza Ekle");
        System.out.println("2-Magaza Guncelle");
        System.out.println("3-Magaza Bilgisi Getir");
        System.out.println("4-Magazaları Listele");
        System.out.println("5-Magaza İşlemleri Yap");
        System.out.println("0-Çıkış");
    }

    public  void  anaIslemler(int secim){
        switch (secim)
        {
            case 1:
                magazaEkle();
                break;
            case 2:
                magazaGuncelle();
                break;
            case 3:
                magazaBilgisiGetir();
                break;
            case 4:
                magazalariListele();
                break;
            case 5:
                magazaIslemleriYap();
                break;
            case 0:
                System.out.println("Çıkış yapılıyor...");
                break;
            default:
                System.out.println("Geçersiz seçim!");
                break;
        }
    }


    public void magazaMenu(Magaza magaza){
        System.out.println("===Magaza Menu===");
        System.out.println("Hoşgeldiniz " +magaza.getAd());
        System.out.println("1- Urun al");
        System.out.println("2-Urun sat");
        System.out.println("3-Mesai Belirle");
        if (magaza instanceof  Yiyecek){
            System.out.println("4-Menu Goster");
            System.out.println("5-Menu Olustur");
        }
        else {
            System.out.println("4- Stok takibi yap");
        }

        System.out.println("0-Üst Menu");

    }


    private void magazaIslemleriYap() {
        Magaza magaza=magazaBilgisiGetir();
        int secim;
        do {
            magazaMenu(magaza);
            secim=secimYap();
            magazaIslemleri(secim,magaza);
            if (magaza instanceof  Yiyecek){
                yiyecekMenuIslemleri(secim,magaza);
            }

        }while (secim!=0);
    }
    public  void magazaIslemleri(int secim, Magaza magaza){
        switch (secim){
            case 1:
                magaza.urunAl();
                break;
            case 2:
                magaza.urunSat();
                break;
            case 3:
                magaza.mesaiSaatiBelirle();
                break;
                case 4:
                     if (!(magaza instanceof Yiyecek)) {
                         ((IStok) magaza).stokTakip();
                     }



        }
    }
    public  void   yiyecekMenuIslemleri(int secim,Magaza magaza){
        switch (secim){
             case 4:
                ((Yiyecek) magaza).menuGoster();
                break;
            case 5:
                ((Yiyecek) magaza).menuOlustur();
                break;
        }

    }

    private void magazalariListele() {
        for (Magaza magaza : avm.getMagazalar()) {
            if (magaza != null) {
                System.out.println(magaza.toString());
            }
        }
    }

    private Magaza magazaBilgisiGetir() {
        System.out.println("Lutfen bir magaza Idsi giriniz");
        int id=Integer.parseInt(scanner.nextLine());
        Magaza magaza = null;
        for (Magaza m : avm.getMagazalar()) {
            if (m != null && m.getId() == id) {
                magaza = m;
                break;
            }
        }
        if (magaza != null) {
            System.out.println(magaza.toString());
        } else {
            System.out.println("Magaza bulunamadi!");
        }
        return magaza;
    }

    private void magazaGuncelle() {
        Magaza magaza=magazaBilgisiGetir();
        String name = magaza.getClass().getName();
        magaza.veriAl();
    }

    private void magazaEkle() {
        Magaza magaza;
        getMagazaTuru();
        int secim=secimYap();
        switch (secim){
            case 1:
                magaza = new Elektronik();
                ((Elektronik)magaza).veriAl();
                break;
            case 2:
                magaza = new Giyim();
                ((Giyim)magaza).veriAl();
                break;
            case 3:
                magaza = new KitapKirtasiye();
                ((KitapKirtasiye)magaza).veriAl();
                break;
            case 4:
                magaza = new Yiyecek();
                ((Yiyecek)magaza).veriAl();
                break;
            default:
                System.out.println("Geçersiz seçim!");
                return;
        }
        avm.getMagazalar()[Avm.magazaSayisi]=magaza;
        Avm.magazaSayisi++;

    }
    public void  getMagazaTuru(){
        System.out.println("1-ELEKTRONIK");
        System.out.println("2-GIYIM");
        System.out.println("3-KITAP_KIRTASIYE");
        System.out.println("4-YIYECEK");

    }

    private int secimYap() {
        int secim;
        System.out.println("Lutfen secim yapınız");
        secim=Integer.parseInt(scanner.nextLine());
        return secim;
    }

}
