package com.ibrahimYasar.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.validation.constraints.Null;


@Interceptor
@interceptorYolKesici
public class intercepterYolKesiciAsilIs {

    @AroundInvoke public Object loglama(InvocationContext context){

        System.out.println("ilk hali: "+context.getMethod().getName());
        //kullanıcı : giriş yapmış mı ?
        boolean isLogin=false;  //yol kesici olacak değişkenimiz
        Object isContinue=null;   //eğer yol kesilmezse devam edecek
        if (isLogin){
            //önce sisteme giriş yapsın
            System.out.println(" !!! once sisteme giris yapsin");
            return null;
        }else {
            try {
                isContinue=context.proceed();//devam etmesini sagladi
                System.out.println("Sonraki hali "+isContinue);
            }catch (Exception e){

                e.printStackTrace();
            }
            return isContinue;
        }
    }

}
