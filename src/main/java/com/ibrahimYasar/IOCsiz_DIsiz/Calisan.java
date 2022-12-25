package com.ibrahimYasar.IOCsiz_DIsiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "CDIsizCalisan")
@ApplicationScoped
public class Calisan {

    private Patron patron;
    //Paramtresiz constructor
    public Calisan() {
        patron=new Patron();
    }

    public String getData(String data){
        return patron.surum(data);
    }
}
