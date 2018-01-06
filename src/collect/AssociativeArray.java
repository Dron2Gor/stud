package collect;

import utilDecember.TextFile;

import java.util.ArrayList;
import java.util.List;

public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int lenght) {
        pairs = new Object[lenght][2];
    }

    public void put(K key, V value) {
        if (index >= pairs.length) throw new ArrayIndexOutOfBoundsException();
        pairs[index++] = new Object[]{key, value};
    }

    //@SuppressWarnings("unchecked")
    public V get(K key) {
        for (int i = 0; i < index; i++)
            if (key.equals((pairs[i][0]))) return (V) pairs[i][1];
        return null;
    }

    public int lenght() {
        return pairs.length;
    }

    public void changeValue(K key, V value) {
        for (int i = 0; i < index; i++) {
            if (key.equals(pairs[i][0])) pairs[i][1] = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(pairs[i][0].toString());
            result.append(": ");
            result.append(pairs[i][1].toString());
            if (i < index - 1) result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        AssociativeArray<String, String> map = new AssociativeArray<String, String>(8);
        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm");
        System.out.println(map);
        List<String> list = new ArrayList<>(TextFile.fileReder("c:\\88.txt", "\\W+"));
        AssociativeArray<String, Integer> mapInt = new AssociativeArray<String, Integer>(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (mapInt.get(list.get(i)) == null) {
                mapInt.put(list.get(i), 1);

            } else mapInt.changeValue(list.get(i), (mapInt.get(list.get(i)) + 1));
        }
        System.out.println(mapInt);
    }
}
