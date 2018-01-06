package std1.exceptionPack;

public class MyException extends Exception {
    String str;

    public MyException(String str) {
        super(str);
        this.str = str;

    }

    @Override
    public String getMessage() {
        return str+" "+super.getMessage();
    }
}
