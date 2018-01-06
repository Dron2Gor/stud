package std1;

public class Camporison {
    public static void compar(String s1, String s2){
        System.out.println("For " +s1+" and "+s2+":" );
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1!=s2);
    }

    public static void main(String[] args) {
        compar("sss","sss");
        compar("ddd","sss");
        compar("dddd","ddd");
    }
}
