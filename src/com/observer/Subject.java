package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    //islemlerde kullancagimiz sayilari tuttugumuz list
    private List<Observer> observers = new ArrayList<Observer>();
    private int sayi;

    public int getSayi() {
        return sayi;
    }

    //sayi parametresini alarak listeyi guncelleyecek methodu cagiriyoruz
    public void setSayi(int sayi) {
        this.sayi = sayi;
        observerListGuncelle();
    }

    //olusturdugumuz observer nesnesini listeye ekledigimiz method
    public void ekle (Observer observer){
        observers.add(observer);
    }

    //olusturdugumuz observer nesnelerinin referanslariyla beraber tutup daha sonra her birini tek tek cagirdigiimz method
    public void observerListGuncelle(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}