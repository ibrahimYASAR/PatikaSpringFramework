package com.ibrahimYasar.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;

//Kapsam
//Yasam suresi
//Performansımızı eksi veya artı yönde etkiler
@Named
//@ApplicationScoped -> bütün uygulama boyunca çalışır. bütün kullanıcılar için
//@RequestScoped -> 1 istek boyunca çalışır
//@SessionScoped -> 1 kullanıcı için yaşar ancak logout
//@Dependent -> bukelemon
//@ConversationScoped -> belli istek boyunca yaşar
//@SessionScoped -> Bean 1 instanse olmasını sağlamak için
public class _00_Scoped {
}
