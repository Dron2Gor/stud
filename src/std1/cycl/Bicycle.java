package std1.cycl;

import java.util.*;

public class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("2 Wheels is spinning");
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = new ArrayList<>();
        ListIterator<Integer> it1 = list1.listIterator();
        ListIterator<Integer> it2= list2.listIterator();

        while (it1.hasNext()) {

            it2.add(it1.next());
            it2.previous();
        }

        System.out.println(list1);
        System.out.println(list2);
    }
}
