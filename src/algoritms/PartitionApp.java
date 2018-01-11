package algoritms;

import java.util.Random;

public class PartitionApp {
    public static void main(String[] args) {
        int maxSize=16;
        Random rand =new Random();
        ArrayIns arr =new ArrayIns(maxSize);
        for (int j=0; j<maxSize; j++){
            arr.insert(rand.nextInt(199));
        }
        arr.display();
        long pivot=99;
        System.out.print("Pivot is "+ pivot);
        int size = arr.size()-1;
        int partDex = arr.partitionIt(0, size-1, pivot);
        System.out.println(". Partititon is at index "+partDex);
        arr.display();
    }
}
