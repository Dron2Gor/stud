package files;

import java.io.*;

public class BasicFileOutput {
    static String file = "BasicFileOutput";

    public static void main(String[] args) throws IOException {
        LineNumberReader in = new LineNumberReader(new FileReader("c:\\88.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("c:\\8.txt")));
        while (in.ready()) {
            int i = in.getLineNumber();
            out.write(i + ":: " + in.readLine()+"\n");
        }
        in.close();
        out.flush();
        out.close();
        BufferedReader reader =new BufferedReader(new FileReader("c:\\8.txt"));
        while (reader.ready()){
            System.out.println(reader.readLine());
        }
    }
}
