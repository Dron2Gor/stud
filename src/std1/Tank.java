package std1;

public class Tank {
    boolean isFull=false;
    public void fullTank(){
        isFull=true;
        System.out.println("Tank is full");
    }
    public void finalize(){
        if (isFull) isFull=false;
        System.out.println("Tank is epmty.");
    }
    public static void main(String[] args) {
     Tank tank=new Tank();
     tank.fullTank();
     tank.finalize();
    }
}
