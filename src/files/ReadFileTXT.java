package files;

import java.io.*;
import java.util.*;

public class ReadFileTXT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("c:\\88.txt"));
        StringBuilder sb = new StringBuilder();
        String sw = "java";
        while (reader.ready()) {
            String temp = reader.readLine();
            sb.append(temp + "\n");
        }
        reader.close();
        String str = sb.toString();
//        System.out.println(str);
        List<String> list = new LinkedList<>(Arrays.asList(str.split("\n")));
        BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\8.txt"));
        int count=0;
        for (String st : list)
            writer.write((++count)+": "+st+"\n");
        writer.flush();
        writer.close();
        BufferedReader reader1 =new BufferedReader(new FileReader("c:\\8.txt"));
        while (reader1.ready())
            System.out.println(reader1.readLine());
        reader1.close();


//        System.out.println("-----------------------------------");
//        Collections.reverse(list);
//        for (String st:list)
//            System.out.println(st);
    }
}
