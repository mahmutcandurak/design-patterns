package com.template;

/**
 * Araba abstract classımızdan override ettiğimiz methodlarımızı Bmw classına ait özelleştirerek oluşturuyoruz...
 */

public class Bmw extends Araba {

    @Override
    void fiyat() {
        System.out.println("BMW 320i aracımız 730.000 TL'dir..");
    }

    @Override
    void message() {
        System.out.println("BMW 320i aracımızın fiyat ve yakıt türü bilgileri :");
    }

    @Override
    void yakitTuru() {
        System.out.println("BMW 320i aracımız benzinlidir.");
    }
}
