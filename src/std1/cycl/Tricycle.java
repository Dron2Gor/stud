package std1.cycl;

import java.util.LinkedList;
import java.util.ListIterator;

public class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("3 Wheels is spinning");
    }

    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        ListIterator<Integer> iterator = integerLinkedList.listIterator();

        for (int i = 0; i < 4; i++) {

            iterator.add(i);
            if (i % 2 != 0) iterator.previous();

        }
        System.out.println(integerLinkedList);
    }
}
