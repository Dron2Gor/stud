package std1.exceptionPack;

public class ExeptionDemo {
    public  static void f() throws ExeptionFirst {
        System.out.println("f");
        throw new ExeptionFirst( " made in f()");
    }
    public static void d() throws ExceptionSecond {
        System.out.println("d");
        throw new ExceptionSecond(" made in d()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (ExeptionFirst e) {
            e.printStackTrace(System.out);
        }
        try {
            d();
        } catch (ExceptionSecond e) {
            e.printStackTrace(System.out);
        }
    }
}
