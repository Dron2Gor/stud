package utilDecember;

import java.io.File;
import java.util.Formatter;

public class DirectoryDemo {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk("D:\\Shir").dirs);
        for (File file: Directory.local(".", "T.*"))
            System.out.println(file);
        System.out.println("----------------------------");
        for (File file: Directory.walk("D:\\Shir","T.*\\.java"))
            System.out.println(file);
        System.out.println("=============================");
        for (File file:Directory.walk("D:\\Shir",".*[fF].*\\.class"))
            System.out.println(file);
        Long size=0L;
        for (File file:Directory.walk("D:\\Shir",".*\\.jpg")){
            System.out.println(file);
            size+=file.length();
        }
        System.out.println(size*1.0/1000000);
        Formatter formatter=new Formatter();
        String st=formatter.format("%.2f", size*1.0/1000000).toString();
        System.out.println(st);
    }

}
