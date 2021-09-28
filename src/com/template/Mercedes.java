package com.template;

/**
 * Araba abstract classımızdan override ettiğimiz methodlarımızı Mercedes classına ait özelleştirerek oluşturuyoruz...
 */


public class Mercedes extends Araba {

    @Override
    void fiyat() {
        System.out.println("Mercedes CLA 200 4MATIC aracımız 685.000 TL'dir... ");
    }

    @Override
    void message() {
        System.out.println("Mercedes CLA 200 4MATIC aracımızın fiyat ve yakıt türü bilgileri :");
    }

    @Override
    void yakitTuru() {
        System.out.println("Mercedes CLA 200 4MATIC aracımız benzinlidir.");
    }
}
