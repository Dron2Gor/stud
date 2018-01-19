package algoritms;

public class MyArrayForSort {
    private int[] array;
    int nElem;

    public MyArrayForSort(int size) {
        array = new int[size];
        nElem = 0;
    }

    public void add(int value) {
        array[nElem] = value;
        nElem++;
    }

    public int length() {
        return array.length;
    }

    void swap(int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    void sortPartsAfterSeparation(int left, int right) {
        if (right -left <= 0) return;
        else {
            int separator = array[right];
            int partition = separatArray(left, right, separator);
            sortPartsAfterSeparation(left, partition - 1);
            sortPartsAfterSeparation(partition + 1, right);
        }
    }

    void sortBySeparation() {
        sortPartsAfterSeparation(0,nElem-1);
    }

    public int separatArray(int left, int right, int separator) {
        int leftIndex = left-1;
        int rightIndex = right;
        while (true) {
            while (array[++leftIndex] < separator) ;
            while (rightIndex > 0 && array[--rightIndex] > separator) ;
            if (leftIndex >= rightIndex) break;
            else {
                swap(leftIndex, rightIndex);
            }
        }
        swap(leftIndex,right);
        return leftIndex;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < nElem; i++) {
            str += array[i] + ", ";
        }
        str = str.substring(0, str.length() - 2);
        str += "]";
        return str;
    }
}
