package types;

import java.util.Arrays;

public class TwoArraysInt {
    private int init;

    public TwoArraysInt(int init) {
        this.init = init;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TwoArraysInt that = (TwoArraysInt) o;

        return init == that.init;
    }

    @Override
    public int hashCode() {
        return init;
    }

    public static void main(String[] args) {
        TwoArraysInt[] t1={new TwoArraysInt(1),new TwoArraysInt(2),new TwoArraysInt(3) };
        TwoArraysInt[] t2={new TwoArraysInt(1),new TwoArraysInt(2),new TwoArraysInt(3) };
        System.out.println(Arrays.equals(t1,t2));
    }
}
