package std1.green;

public class GreenHouseControlsNew extends GreenhouseControls{
    private boolean humidification=false;
    public class HumidificationOn extends Event {
        public HumidificationOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humidification=true;
        }

        @Override
        public String toString() {
            return "Увлажнение включено";
        }
    }
    public class HumidificationOff extends Event {
        public HumidificationOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humidification=false;
        }

        @Override
        public String toString() {
            return "Увлажнение выключено";
        }
    }
}
