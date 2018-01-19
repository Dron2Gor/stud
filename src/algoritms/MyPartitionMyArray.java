package algoritms;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class MyPartitionMyArray {

    public static void main(String[] args) throws MalformedURLException {
//        MyArrayForSort array = new MyArrayForSort(20);
//        Random rand = new Random(88);
//        for (int i = 0; i < array.length(); i++) {
//            array.add(rand.nextInt(199));
//        }
//        System.out.println(array);
//        array.sortBySeparation();
//        System.out.println(array);
        String st = "https://javarush.ru/testdata/secretPasswords.txt";
        URL url = new URL(st);
        String name = st.substring(st.lastIndexOf("/") + 1, st.lastIndexOf("."));
        String ext = st.substring(st.lastIndexOf(".") + 1, st.length());
        System.out.println(name + "." + ext);

        System.out.println(url);
    }
}
