package com.observer;

public class IkinciKuvvet extends Observer{

    //subject tipinde olusturdugumuz nesneyi parametre olarak gonderip class icerisindeki degerleri this yardimiyla guncelliyoruz.
    public IkinciKuvvet(Subject subject){
        this.subject = subject;
        this.subject.ekle(this);
    }

    //subject nesnesiyle verilen sayi degiskenini get methoduyla cagirip isleme sokarak karesi alinmis sayiyi ekrana basıyoruz.
    @Override
    public void update() {
        int kare = subject.getSayi();
        System.out.println( "Kare alınmış sonuç: " + (kare * kare) );
    }
}
