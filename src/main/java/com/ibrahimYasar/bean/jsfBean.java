package com.ibrahimYasar.bean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;


@Named(value = "cdiBean")
@RequestScoped
@Setter  @Getter
public class jsfBean {

    private String patika;

    public jsfBean() {
        this.patika="Spring Boot Egitimine Hosgeldiniz";
    }


}
