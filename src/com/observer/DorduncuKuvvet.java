package com.observer;

public class DorduncuKuvvet extends Observer{

    //subject tipinde olusturdugumuz nesneyi parametre olarak gonderip class icerisindeki degerleri this yardimiyla guncelliyoruz.
    public DorduncuKuvvet(Subject subject){
        this.subject = subject;
        this.subject.ekle(this);
    }

    //subject nesnesiyle verilen sayi degiskenini get methoduyla cagirip isleme sokarak karesi alinmis sayiyi ekrana basıyoruz.
    @Override
    public void update() {
        int dorduncu = subject.getSayi();
        System.out.println( "Dördüncü kuvveti alınmış sonuç: " + (dorduncu*dorduncu*dorduncu*dorduncu) );

    }
}
