package classes;

import std1.ConnectionManager;
import std1.inhirit.A;


import java.lang.reflect.Field;

public class ClassAllInherit extends A {
    public static void getAllIerach(Class cc) {

        Field[] cl = cc.getDeclaredFields();
for (Field fl:cl){
    System.out.println(fl);
}




    }

    public static void main(String[] args) {
        ConnectionManager cm=new ConnectionManager();

      getAllIerach(cm.getClass());
//        System.out.println((new B().getClass().getSuperclass()));
    }
}
