package com.observer;

public class UcuncuKuvvet extends Observer{

    //subject tipinde olusturdugumuz nesneyi parametre olarak gonderip class icerisindeki degerleri this yardimiyla guncelliyoruz.
    public UcuncuKuvvet(Subject subject){
        this.subject = subject;
        this.subject.ekle(this);
    }

    //subject nesnesiyle verilen sayi degiskenini get methoduyla cagirip isleme sokarak karesi alinmis sayiyi ekrana basıyoruz.
    @Override
    public void update() {
        int kup = subject.getSayi();
        System.out.println( "Küp alınmış sonuç: " + (kup*kup*kup) );
    }
}