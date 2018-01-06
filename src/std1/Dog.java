package std1;

public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog spot=new Dog();
        Dog scruffy = new Dog();
        spot.name="Gil";
        spot.says= "Gav";
        scruffy.name="Dar";
        scruffy.says="Av";
        System.out.println(spot.name+" says "+spot.says);
        System.out.println(scruffy.name+" says "+scruffy.says);
        Dog pes=new Dog();
        spot=pes;
        System.out.println(spot==pes);
        System.out.println(spot.equals(pes));
    }
}
