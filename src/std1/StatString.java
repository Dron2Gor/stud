package std1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StatString {
    public void f(String ... str){
        System.out.println(Arrays.toString(str));
    }

    public static void main(String[] args) {
        String[] strArray=new String[4];
        StatString statString=new StatString();
        statString.f("ww","tt", "yy");
        statString.f(strArray);

    }
}
