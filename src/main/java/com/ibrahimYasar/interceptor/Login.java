package com.ibrahimYasar.interceptor;

public class Login {

    @interceptorYolKesici
    public String isLoginMethod(String data){
        return "isLogin: "+data ;
    }

}
