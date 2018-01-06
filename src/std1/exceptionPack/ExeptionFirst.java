package std1.exceptionPack;

public class ExeptionFirst extends Exception {
    public ExeptionFirst(String msg) {super(msg);
    }

    @Override
    public String getMessage() {
        return " это мое исключение"+super.getMessage();
    }
}
