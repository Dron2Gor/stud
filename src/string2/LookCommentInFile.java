package string2;

import utilDecember.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LookCommentInFile {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("class\\s+[A-Z]\\w+");
//        Pattern p = Pattern.compile("/\\*\\*(.*?)\\*/", Pattern.DOTALL);
        String stAp = "";
        for (String st : TextFile.fileReder(args[0], args[1])) {
            stAp += st;
        }
        String temp = "";
        Matcher m = p.matcher(stAp);
        while (m.find()) {
            temp = m.group();
            temp = temp.replaceAll(" {2,}", " ");
            temp = temp.replaceAll("class ","");
//            temp = temp.replaceAll(" \\*", "\n\\*");
//            temp = temp.replaceAll("/\\*", " \n/\\*");
            System.out.println(temp);
            System.out.println("-----------------------------");
        }
    }
}
