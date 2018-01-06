package collect.wordLetter;

import java.util.*;

import static utilDecember.TextFile.fileReder;

public class UniqueWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(fileReder("c:\\88.txt",""));

//        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);
        Map<String, Integer> map = new TreeMap<>();
        Set<WordConteiner> wordConteiners = new HashSet<>();

        for (String str : words) {
            Integer freq = map.get(str);
            map.put(str, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
        for (Map.Entry<String,Integer>  entry : map.entrySet()) {
            wordConteiners.add(new WordConteiner(entry.getKey(),entry.getValue()));

        }

        System.out.println(wordConteiners);

    }
}