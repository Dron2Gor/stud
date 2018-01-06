package std1;

public class Connection {
    private static int j = 0;
    private int count = 0;

    private Connection() {
        count = j;
        j++;
    }

     static Connection makeConection() {
        return new Connection();
    }

    @Override
    public String toString() {
        return Integer.toString(count);
    }
}
