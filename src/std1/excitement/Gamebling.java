package std1.excitement;

public class Gamebling {
    public static void playBones (TrowSubFactory trowSubFactory){
        ThrowSub ts=trowSubFactory.getTrowSub();
        ts.dice();
    }

    public static void main(String[] args) {
        playBones(new CoinFactory());
        playBones(new CubeFactory());
    }
}
