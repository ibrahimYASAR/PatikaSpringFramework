package com.ibrahimYasar.Qualifier3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {
    //Defaultta calissacak kodlar
    @Inject
    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
    private PatronInterface patronInterface;


    public String getData(String data){
        return patronInterface.surum(data);
    }
}
