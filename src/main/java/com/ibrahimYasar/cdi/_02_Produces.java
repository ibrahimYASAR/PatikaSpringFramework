package com.ibrahimYasar.cdi;

import lombok.Value;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value ="producetuto")
@ApplicationScoped //sepet uygulamasında ürün her seferinde geriye gelmesi isteniyorsa

public class _02_Produces {
    @Produces //üretiyor ==> listedeki yapılar üretiliyor
    public  List<String> getList(){

        List<String> list=new ArrayList<>();
        list.add("Html5");
        list.add("Css3");
        list.add("js");
        list.add("react");
        list.add("angular");


        return list;
    }
}
