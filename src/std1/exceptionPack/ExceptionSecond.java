package std1.exceptionPack;

public class ExceptionSecond extends Exception {
    public ExceptionSecond(String msg) {super(msg);
    }

    @Override
    public String getMessage() {
        return " это мое исключение"+super.getMessage();
    }
}
