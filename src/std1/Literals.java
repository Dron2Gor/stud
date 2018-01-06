package std1;

public class Literals {
    public static void main(String[] args) {
        int i1=0x2f;
        System.out.println(Integer.toBinaryString(i1));
        int i2=0X2F;
        System.out.println(Integer.toBinaryString(i2));
        int i3=0177;
        System.out.println(Integer.toBinaryString(i3));
        long l1=0x2f;
        System.out.println(Long.toBinaryString(l1));
        long l2=0X2F;
        System.out.println(Long.toBinaryString(l2));
        System.out.println(i1);
        System.out.println(l1);
    }
}
