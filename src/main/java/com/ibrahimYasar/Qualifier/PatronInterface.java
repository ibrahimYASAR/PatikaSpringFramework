package com.ibrahimYasar.Qualifier;

import javax.enterprise.inject.Alternative;
import javax.inject.Qualifier;

public interface PatronInterface {

    //@Alternative -> aynı anda sadece 1 tane projeyi çalıştırıyor diğerleri kapalı
    //@Qualifier   -> aynı anda birden fazla proje aktif ancak default olarak çalışacak projeyi seçebiliyoruz.

    public String surum(String data);
}
