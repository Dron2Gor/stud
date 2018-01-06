package std1.excitement;

public class CoinFactory implements TrowSubFactory {
    @Override
    public ThrowSub getTrowSub() {
        return new Coin();
    }
}
