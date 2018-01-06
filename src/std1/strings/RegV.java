package std1.strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegV {
    public static void main(String[] args) {


    Pattern pattern1= Pattern.compile("[A-Z]{1}([a-zA-Z\\s\\d[,][-]]+)?[.]");
    Pattern pattern2 = Pattern.compile("a|e|y|u|i|o|");
    String sentence="Then, when you found the shrubery, you must cut down the mightiest tree.";
//    String[] arS=sentence.split("\\W");
//        System.out.println(Arrays.toString(arS));
        System.out.println(sentence.replaceAll("[aeyuio]", "_"));
    if (pattern1.matcher(sentence).matches()) System.out.println("Yes");else System.out.println("No");
//    Pattern pattern3=Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
//    String s2;
//    String s1="Arline ate eight apples and one orange while Anita hadn'n any";
//        System.out.println(s1.matches("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\b"));
//   String[] sArray={"^Java","\\b reg.*","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}","s{0,3}" };
//   String s3="Java now has regular expressions";
//        System.out.println(s3);
//        for (String s:sArray){
//            System.out.println(" Regular expression: "+s);
//            Pattern p=Pattern.compile(s);
//            Matcher m=p.matcher(s3);
//            while (m.find()){
//                System.out.println("Match "+m.group()+" at position "+m.start()+"-"+(m.end()-1));
//            }
//        }
    }

}
