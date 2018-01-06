package std1.inhirit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static int count = 0;
    int i=0;

    public TestArray() {
        count++;
        i=count;
    }

    @Override
    public String toString() {
        return ("TestArray{} " + i);
    }

    public static void main(String[] args) {
        TestArray[] testArrays = {new TestArray(), new TestArray(), new TestArray(), new TestArray()};
        ArrayList<TestArray> list = new ArrayList<>(Arrays.asList(testArrays));
        List<TestArray> subTestArray;
        subTestArray = list.subList(1, 3);
        System.out.println(list);
        System.out.println(subTestArray);
        list.removeAll(subTestArray);
        System.out.println(list);
    }
}
