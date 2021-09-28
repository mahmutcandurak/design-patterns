package com.prototype;

import java.util.ArrayList;
import java.util.List;

//Nesnelerimizi clone'layabilmemiz icin Cloneable interface'ini implement etmemiz gerekiyor.
public class HaliSahaKadro implements Cloneable {

        // Kadrolari tutabilmek icin list olusturuyoruz.
        private List<String> kadro;


        public HaliSahaKadro() {
            kadro = new ArrayList<String>();
        }

        public HaliSahaKadro(List<String> liste) {
            this.kadro = liste;
        }

        //kadro listemize default oyuncuları ekledigimiz method
        public void oyuncuEkle() {
            kadro.add("Can");
            kadro.add("Ege");
            kadro.add("Oğuz");
            kadro.add("Ali");
            kadro.add("Gökhan");
        }

        public List<String> getKadro() {
            return kadro;
        }


        @Override
        public Object clone() throws CloneNotSupportedException {
            List<String> kadro = new ArrayList<String>();
            for (String s : this.getKadro()) {
                kadro.add(s);
            }
            return new HaliSahaKadro(kadro);
        }
}