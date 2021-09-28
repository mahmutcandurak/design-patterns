package com.prototype;
import java.util.List;

/**
 * Prototype pattern: Mevcut nesnelerin prototiplerinin oluşturulmasını yani nesnelerin kopyalarını elde etmeyi sağlayan bir tasarım desenidir.
 *
 * HaliSahaKadro sinifindan nesne olusturarak bir list elde edip, daha sonra yeniden nesne olusturmak yerine bu nesneyi clone'layarak elde ettigimiz
 * yeni listeler uzerinden islemler yapiyoruz. Bu clonelama islemini yerine getirebilmek icin Cloneable interface'ini implement etmemiz gerekiyor.
 */

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        //nesne olusturarak once default constrcutors sayesinde list olusturup daha sonra oyuncuEkle methoduyla beraber listeye default oyuncuları ekliyoruz.
        HaliSahaKadro kadro = new HaliSahaKadro();
        kadro.oyuncuEkle();

        //daha sonra olusturdugumuz nesneyi clonluyoruz.
        HaliSahaKadro newHaliSahaKadro = (HaliSahaKadro) kadro.clone();
        HaliSahaKadro newHaliSahaKadro2 = (HaliSahaKadro) kadro.clone();

        //olusturdugumuz ilk clone nesneden listeyi cekip listeye yeni oyuncuları ekliyoruz.
        List<String> list = newHaliSahaKadro.getKadro();
        list.add("Bekir");
        list.add("Salih");
        list.add("Ayberk");

        //olusturdugumuz ikinci clone nesneden listeyi cekip "Gökhan" oyuncusunu listeden siliyoruz.
        List<String> list1 = newHaliSahaKadro2.getKadro();
        list1.remove("Gökhan");

        //default kadro listimizi ve daha sonra guncelledigimiz listelerimizi ekrana basıyoruz.
        System.out.println("İlk Kadro: " + kadro.getKadro());
        System.out.println("\nOyuncular eklenmiş kadro : " + list);
        System.out.println("\nBir oyuncu silinmiş kadro : " + list1);

    }
}
