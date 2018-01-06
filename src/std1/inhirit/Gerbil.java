package std1.inhirit;

import java.util.*;

public class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Vot- " + gerbilNumber);
    }

    public static void main(String[] args) {
        Map <String, Gerbil> map=new HashMap<>();
        map.put("Vasia",new Gerbil(1));
        map.put("Vania",new Gerbil(2));
        map.put("Vova",new Gerbil(3));
        map.put("Venia",new Gerbil(4));
        Iterator<String> iteratorKey= map.keySet().iterator();
        while (iteratorKey.hasNext()){
           String s=iteratorKey.next();
           map.get(s).hop();
            System.out.println(s);
        }


    }
}


