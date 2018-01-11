package algoritms;


public class ArrayIns {
    private long[] theArray;
    private int nElems;
    public ArrayIns(int max){
        theArray =new long[max];
        nElems = 0;
    }
    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }
    public int size(){return nElems;}
    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(theArray[i]+" ");
        }
        System.out.println("");
    }
    public int partitionIt (int left, int right, long pivot){
        int leftPtr= left-1;
        int rightPtr=right+1;
        while (true){
            while (leftPtr<right && theArray[++leftPtr]<pivot);
            while (rightPtr>left && theArray[--rightPtr]>pivot);
            if (leftPtr>=rightPtr)
                break;
            else swap(leftPtr, rightPtr);
        }
        return leftPtr;
    }
    public void swap(int dex1, int dex2){
        long temp;
        temp=theArray[dex1];
        theArray[dex1]=theArray[dex2];
        theArray[dex2]=temp;
    }
    public void insertionSort(){
        int in, out;
        for (out=1; out<nElems; out++){
            long temp= theArray[out];
            in=out;
            while (in>0 && theArray[in-1]>=temp){
                theArray[in]= theArray[in-1];
                --in;
            }
            theArray[in]=temp;
        }
    }
}
