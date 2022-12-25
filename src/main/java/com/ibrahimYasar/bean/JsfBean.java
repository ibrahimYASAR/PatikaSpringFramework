package com.ibrahimYasar.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "cdiBean")
@RequestScoped
@Getter @Setter
public class JsfBean {

    private String patika;

    public JsfBean() {
        patika="Spring Boot Eğitime Hoşgeldiniz";
    }
}

