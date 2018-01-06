package scan;

import classes.OlesyaClass;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HiddenImplementation {
    static void callHiddenMethod(Object o, String methodName) throws Exception{
        Method method=o.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);
    }
    static void callAllMethods(Object o) throws Exception{
        List<Method> list=new  ArrayList(Arrays.asList(o.getClass().getMethods()));

        for(Method method:list){
            if (method.getName().contains("void"))
            callHiddenMethod(o,method.getName());
            System.out.println(method.getName());
        }
    }

    public static void main(String[] args) throws Exception {
        OlesyaClass olesyaClass=new OlesyaClass();

        callHiddenMethod(olesyaClass,"publ");
        callHiddenMethod(olesyaClass,"priv");
        System.out.println("All methods invoke");
        callAllMethods(olesyaClass);
    }
}
