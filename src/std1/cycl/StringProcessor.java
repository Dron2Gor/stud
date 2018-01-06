package std1.cycl;

public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object input);
    public static String s="If she weight same as duck? she is made wood";

}
