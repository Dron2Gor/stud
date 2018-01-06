package types;

import java.util.Set;
import java.util.TreeSet;

public class TreeTest {
    public static Set tree=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

    public static void main(String[] args) {
        tree.addAll(new CollectionData<String>(new RandomGenerator.String(),6));
        System.out.println(tree);

    }
}
