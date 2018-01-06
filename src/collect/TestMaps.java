package collect;

import java.util.*;

public class TestMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> sortedMap = new TreeMap<>();
        Map<String, Integer> insMap = new LinkedHashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " " + entry.getKey().hashCode() + " " + entry.getValue().hashCode());
        }
        List<String> list=new ArrayList(map.values());
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
    }


}
