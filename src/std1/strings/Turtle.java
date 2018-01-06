package std1.strings;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
    private String name;
    private Formatter f;
    public Turtle(String name, Formatter f){
        this.name=name;
        this.f=f;
    }
    public void move(int x, int y){
        f.format("%s The turtle is at (%d,%d)\n", name,x,y);
    }

    public static void main(String[] args) {
        PrintStream outAlias=System.out;
        Turtle tommy=new Turtle("Tommy", new Formatter(System.out));
        Turtle terry =new Turtle("Terry", new Formatter(System.err));
        tommy.move(1,1);
        tommy.move(4,4);
        terry.move(2,2);
        terry.move(6,6);
    }
}
