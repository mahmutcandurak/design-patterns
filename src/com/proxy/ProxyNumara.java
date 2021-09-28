package com.proxy;

public class ProxyNumara implements INumara {
    private AnaNumara anaNumara;
    private String numara;

    public ProxyNumara(String numara){
        this.numara = numara;
    }


     /*
     * anaNumara degiskeninde herhangi bir numara tutulup tutulmadigini kontrol ederek eger numara yoksa numara degiskenini parametre alarak anaNumara nesnesini olusturur.
     * eger numara varsa yeni bir nesne olusturmayip var olan degerle display methodunu cagirir.
     */

    @Override
    public void display() {
        if(anaNumara == null){
            anaNumara = new AnaNumara(numara);
        }
        anaNumara.display();
    }
}
