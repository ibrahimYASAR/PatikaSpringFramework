package com.ibrahimYasar.IOCli_DIli;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "CDIli_DIli_Calisan")
@ApplicationScoped
public class Calisan {
    @Inject
    private PatronInterface patronInterface;
    //Paramtresiz constructor
    public Calisan() {
       // patronInterface =new Patron();
    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
