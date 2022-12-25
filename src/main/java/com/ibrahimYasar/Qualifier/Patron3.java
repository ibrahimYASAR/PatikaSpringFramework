package com.ibrahimYasar.Qualifier;

@QualifierMultiple
public class Patron3 implements PatronInterface {
    @Override
    public String surum(String data){
        return "QualifierMultiple 2: "+data;
    }
}
