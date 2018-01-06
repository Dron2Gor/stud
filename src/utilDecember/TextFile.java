package utilDecember;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* Читает файл по строчно и передает строки в Лист*/
public class TextFile {
    static List<String> list = new ArrayList<>();
    public static List<String> fileReder(String fileName, String regex)  {

        try {
            InputStream   inputStream = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                String s = reader.readLine();
                list.addAll(Arrays.asList(s.split(regex)));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Can't read file");
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(fileReder("c:\\88.txt","\\w+"));
    }
}
