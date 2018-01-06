package files;

import java.io.*;
import java.util.Random;

public class SerialTest implements Serializable {
    private static Random rand=new Random();
    public static String name = "Olesia";
    private DataSerTest dataSerTest;

    public SerialTest(int i) {
        dataSerTest=new DataSerTest(rand.nextInt(i));
    }

    @Override
    public String toString() {
        return "SerialTest{" +
                "dataSerTest=" + dataSerTest +" "+name+
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerialTest st1=new SerialTest(10);
        SerialTest st2=new SerialTest(4);
        System.out.println(st1);
        System.out.println(st2);

        ObjectOutputStream out1=new ObjectOutputStream(new FileOutputStream("c:\\ser.out"));
        out1.writeObject(st1);
        out1.writeObject(st2);
        out1.close();
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:\\ser.out"));
        SerialTest st3=(SerialTest)in.readObject();
        SerialTest st4=(SerialTest) in.readObject();
        System.out.println(st3);
        System.out.println(st4);
    }
}
