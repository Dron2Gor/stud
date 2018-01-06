package std1.excitement;

public class CubeFactory implements TrowSubFactory {
    @Override
    public ThrowSub getTrowSub() {
        return new Cube();
    }
}
