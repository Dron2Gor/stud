package std1.inhirit;


public class Second {
    public class InnerSecond extends First.InnerFirst{
        public InnerSecond(First f, int i) {
            f.super(i);

        }
    }

    public static void main(String[] args) {
        Second second=new Second();
        second.new InnerSecond(new First(),4);
    }
}
