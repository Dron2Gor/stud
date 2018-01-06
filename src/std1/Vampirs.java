package std1;

import java.util.Arrays;
import java.util.HashSet;

public class Vampirs {
    static void printVampire(int n1, int n2, int n3){
        if(n1*n2==n3){
            System.out.println(n1+"*"+n2+"="+n3);
        }
    }

    public static void main(String[] args) {
        HashSet<Integer> found=new HashSet<>();
        for(int i=11;i<=12;i++){
            for(int j=11;j<=12;j++){
                int k = i * j;
                if(!found.contains(k)){
                    char ar1[]=((new Integer(i)).toString()+(new Integer(j)).toString()).toCharArray();
                    char ar2[]=(new Integer(k)).toString().toCharArray();
                    Arrays.sort(ar1);
                    Arrays.sort(ar2);
                    if(Arrays.equals(ar1,ar2)){
                        found.add(k);
                        printVampire(i,j,k);
                    }
                }
            }
        }
    }
}