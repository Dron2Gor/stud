package std1.excitement;

public class Outer {
    private String st;

    public Outer(String st) {
        this.st = st;
    }

    class Inner{
        public Inner() {
            System.out.println("Inner made");
        }

        @Override
        public String toString() {
            return st;
        }
    }
    public Inner returnInner (){
        return new Inner();
    }

    public static void main(String[] args) {
        Inner inner=new Outer("VOOT").returnInner();
        System.out.println(inner.toString());
        System.out.println(inner);
    }

}
