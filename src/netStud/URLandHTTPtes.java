package netStud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLandHTTPtes {
    public static void main(String[] args) throws IOException {
        URLConnection connection=new URL("http://www.google.com").openConnection();
//        Scanner scanner=new Scanner(connection.getInputStream());
//        System.out.println("Scaner------"+"\n"+scanner.next()+"\n");
        System.out.println("BufferedReader-----------"+"\n");
        BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while (reader.ready())
        System.out.println(reader.readLine());
    }
}
