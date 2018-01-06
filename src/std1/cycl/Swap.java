package std1.cycl;

import java.util.Arrays;

public class Swap extends StringProcessor {
    @Override
    public String process(Object input) {
        char[] ar=((String)input).toCharArray();
        for (int i = 0; i <ar.length ; i=i+2) {
            char temp;
            temp=ar[i];
            ar[i]=ar[i+1];
            ar[i+1]=temp;
        }
        return Arrays.toString(ar);
    }
    public static void main(String[] args) {
        Apply.process(new Swap(),s);
    }
}
