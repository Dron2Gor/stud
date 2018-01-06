package std1.excitement;

public class Coin implements ThrowSub {

    @Override
    public void dice() {
     int i=rand.nextInt(2);
        if(i==0) System.out.println("orel "+i);
     else System.out.println("reshka "+ i);

    }
}

