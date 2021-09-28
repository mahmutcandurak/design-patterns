package com.proxy;


/**
 *  Proxy pattern: İstemcinin orijinal nesneye direkt erişimi yerine bu erişimi nesneyi temsil eden proxy (vekil) sınıflar üzerinden gerçekleştirmesini sağlar..
 *
 *  Kullanicinin girdigi numaranın sistemde var olup olmadigini kontrol ederek eger sistemde var ise ekrana direkt girilen numarayı yazan,
 *  eger girilen numara sistemde kayitli degil ise sisteme kaydedildiğinin bilgisini vererek daha sonra girilen numarayı ekrana basan ufak kod parcasi...
 */

public class ProxyTest {
    public static void main(String[] args) {
        INumara inumara = new ProxyNumara("(599) 123 45 69");

        //inumara ilk defa girildigi icin once yuklemeyi gerceklestirecek daha sonra ekrana basacak.
        inumara.display();
        System.out.println("");

        // inumara daha once kaydedildigi icin direkt ekrana basacak
        inumara.display();
    }
}
