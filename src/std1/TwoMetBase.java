package std1;

public class TwoMetBase {
    void methodOne() {
        System.out.print("Вызываю метод 2 из базы ");
        methodTwo();
    }

    void methodTwo() {
        System.out.println("1111");
    }
}
