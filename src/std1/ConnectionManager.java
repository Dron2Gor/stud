package std1;

public class ConnectionManager {
    private static int i = 0;
    private static Connection[] connections = new Connection[4];

    static {
        for (int j = 0; j < 4; j++) {
            connections[j] = Connection.makeConection();
            System.out.println("Make connection " + j);
        }
    }

    public static Connection retConection() {
        if (i < 4) {
            return connections[i++];
        } else System.out.println("No more");
        return  null;

    }

}
