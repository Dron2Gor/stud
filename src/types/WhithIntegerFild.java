package types;

import java.util.Random;


public class WhithIntegerFild implements Comparable<WhithIntegerFild>{

   public static Random rand=new Random();
    Integer integer;

    public WhithIntegerFild() {
        integer=rand.nextInt(100);
    }

    @Override
    public int compareTo(WhithIntegerFild o) {
        if (integer>o.integer) return +1;
        if (integer==o.integer) return 0;else
        return -1;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" :"+ integer;
    }

    public static void main(String[] args) {
        PriorQueue priorQueue=new PriorQueue();
        priorQueue.add(new WhithIntegerFild());
        priorQueue.add(new WhithIntegerFild());
        priorQueue.add(new WhithIntegerFild());
        priorQueue.add(new WhithIntegerFild());
    while (!priorQueue.isEmpty())
        System.out.println(priorQueue.poll());
    }

}
