package com.ibrahimYasar.Qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {
    //Defaultta calissacak kodlar
    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;
    //Paramtresiz constructor
    public Calisan() {
       // patronInterface =new Patron();
    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
