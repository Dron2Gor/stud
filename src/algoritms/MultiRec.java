package algoritms;

public class MultiRec {

    static int mult(int x, int y) {
        if (y>0){
        int res;
        if (y%2==1) return x*mult(x,y-1);
        else
        res=mult(x,y/2);
        return res*res;
        }else return 1;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        System.out.println(mult(x, y));
    }


}
