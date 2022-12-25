package com.ibrahimYasar.IOCli_DIli;



public class Patron implements PatronInterface {
    @Override
    public String surum(String data){
        return "sürüm "+data;
    }
}
