package files;

import java.io.Serializable;

public class DataSerTest implements Serializable {
    private int count;

    public DataSerTest(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DataSerTest{" +
                "count=" + count +
                '}';
    }
}
