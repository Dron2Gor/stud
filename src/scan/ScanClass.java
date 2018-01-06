package scan;

import java.util.Scanner;

public class ScanClass {
    int i;
    long l;
    float f;
    double d;
    String s;
    public ScanClass(String str){
        Scanner scanner=new Scanner(str);
        i=scanner.nextInt();
        l=scanner.nextLong();
        f=scanner.nextFloat();
        d=scanner.nextDouble();
        s=scanner.nextLine();

    }

    @Override
    public String toString() {
        return "ScanClass{" +
                "i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new ScanClass(" 88 500 4.14 6.35874 name"));
    }
}

