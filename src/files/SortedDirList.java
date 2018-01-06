package files;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortedDirList {
    static File path = new File("c:");
    static String[] list;

    public static String[] list() {
        list = path.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }

    public static String[] list(String regex) {
        list = path.list(new FilenameFilter() {
            Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }

    public static void main(String[] args) {

        for (String st : list(args[0]))
            System.out.println(st);

    }

}
