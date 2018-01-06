package std1;

public class TestClass {

    public void finalize() {
        System.out.println("Game over");
    }

    public static void main(String[] args) {
        TestClass test=new TestClass();

    }
}
