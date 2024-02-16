package com.avmyonetim;

public class App {

    public static void main(String[] args) {
        Avm avm=new Avm(1,"MyAVM","Ankara",7);
        AvmManager avmManager=new AvmManager(avm);
        avmManager.uygulama();
    }
}
