package com.proxy;

public class AnaNumara implements INumara {
    private String numara;

    public AnaNumara(String numara){
        this.numara = numara;
        loadFromDisk(numara);
    }

    //son durumda elde edilen numara degiskenini ekrana basar
    @Override
    public void display() {
        System.out.println("Sisteme kaydedilen numara : " + numara);
    }

    //numaranin sisteme kaydedildigini bildirir
    private void loadFromDisk(String numara){
        System.out.println("Numara sisteme giriliyor.. " + numara);
    }
}
