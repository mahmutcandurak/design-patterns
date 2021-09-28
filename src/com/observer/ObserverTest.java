package com.observer;

/**
 * Observer pattern: Bir nesnede meydana gelen değişikliği içinde bulunduğu listedeki tüm elemanlara bildiren tasarım desenidir.
 *
 * Ornek kod parcasinda, subject ana classimizda tanimladigimiz list icerisine observer tipinde olusturdugumuz nesnelerimizi atıyoruz.
 * Daha sonra "subject.setSayi(2);" komutuyla beraber sirayla observer tipinde nesneler cagirilarak gerekli islemler gerceklestirilir.
 */


public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();

        //subject nesnesini parametre olarak gonderip tekrardan nesne olusturmaya gerek kalmadan islemleri gerceklestirebiliyoruz.
        new IkinciKuvvet(subject);
        new UcuncuKuvvet(subject);
        new DorduncuKuvvet(subject);

        System.out.println("İlk işlem için 2 sayısını gönderiyoruz...");
        subject.setSayi(2);
        System.out.println("\nİkinci işlem için 10 sayısını gönderiyoruz...");
        subject.setSayi(10);
    }
}