package com.template;


/**
 * Template method design patterninin amacı bir algoritmadaki işlemleri iskelet olarak tanımladıktan sonra ayrıntılarını subclass'ların oluşturmasına izin vermektir.
 *
 * İnceleyeceğimiz örneğimizde basitçe bu mantığı ele almak için 2 adet araç oluşturup abstract classımızda bu araçlara ait özellikleri bildiren methodları tanımlıyoruz.
 * Daha sonra oluşturduğumuz bu methodları "final" anahtar kelimesiyle oluşturduğumuz ozellikler methodumuzda istediğimiz sırada yerleştirerek extends ettiğimiz alt classlarımızın
 * bu sıraya uygun bir şekilde kullanmasını sağlamaktır.
 *
 * Örneğin biz "ozellikler" methodumuza sırayla message-yakitTuru-fiyat methodlarımızı yerleştirdiğimiz için daha sonra alt classlarda tanımlamalar farklı sırayla yapılsa dahi çıktımız
 * bizim oluşturduğumuz message-yakitTuru-fiyat sırasıyla çıktıları verecektir.
 */

public class TemplateTest {
    public static void main(String[] args) {

        //Araba abstract classımızın türünce Mercedes clasımızı türetiyoruz ve daha sonra abstract class içinde tanımlanan ozellikler methodumuzu her iki nesne için de çağırıyoruz..
        Araba araba = new Mercedes();
        araba.ozellikler();
        System.out.println();
        araba = new Bmw();
        araba.ozellikler();
    }
}