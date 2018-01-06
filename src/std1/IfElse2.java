package std1;

public class IfElse2 {
    static int test (int testval, int target, int begin,int end){
        if (testval>target &(testval>=begin & testval<=end ))return +1;
        else if (testval<target)return -1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(10,5, 8,12));
        System.out.println(test(5,10, 8,12));
        System.out.println(test(5,5,8,12));
    }
}
