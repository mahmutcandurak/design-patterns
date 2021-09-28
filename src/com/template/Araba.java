package com.template;

/**
 * Araba classımızı abstract tanımladıktan sonra önce alt classlarda içeriği doldurulacak olan methodlarımızı tanımlıyoruz.
 * Daha sonra final olarak tanımladığımız ozellikler methodunu oluşturup bu methodları içerisine istediğimiz sırayla ekliyoruz.
 *
 */

public abstract class Araba {
    abstract void message();
    abstract void yakitTuru();
    abstract void fiyat();

    //Template method
    public final void ozellikler(){

        //Bilgilerin verildiğini ekrana bastıran method
        message();

        //Aracın yakıt türünü belirtir
        yakitTuru();

        //Aracın fiyatını belirtir.
        fiyat();
    }
}