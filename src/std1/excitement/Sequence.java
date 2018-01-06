package std1.excitement;

import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {
    private ArrayList<Object> items;
    private int next = 0;
    int size=0;

    public Sequence(int size) {
        items = new ArrayList<>();
        this.size=size;

    }

    public void add(Object x) {

        if (next++ < size) {
        items.add(x);

        }
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size()) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence(4);
        for (int i = 0; i < 4; i++) {
            sequence.add(new ClassString("op-" + i));
        }
        Iterator<Object> iterator = sequence.items.iterator();

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
        while (iterator.hasNext()) System.out.println("1 " + iterator.next());
    }
}
