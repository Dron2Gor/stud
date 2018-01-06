package std1.green;

import java.util.Iterator;
import java.util.List;

public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Свет включен";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;

        }

        @Override
        public String toString() {
            return "Свет выключен";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Полив включен";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Полив выключен";
        }
    }

    private String thermostat = "День";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Ночь";
        }

        @Override
        public String toString() {
            return "Термостат в ночном режиме";
        }
    }

    public class ThermostatDay extends Event {

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "День";
        }

        @Override
        public String toString() {
            return "Термостат в дневном режиме";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            new Bell(delayTime);
        }

        @Override
        public String toString() {
            return "Бам!";
        }
    }

    public class Restart extends Event {
        private List<Event> eventList;


        public Restart(long delayTime, List<Event> eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        @Override
        public void action() {
//            for (Event e : eventList) {
//                e.start();
//                addEvent(e);
//            }
            Iterator<Event> it=eventList.iterator();
            while (it.hasNext()){
                Event e=it.next();
                        e.start();
                        addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Перезапуск системы";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Отключение";
        }
    }

    private boolean air = false;

    public class AerationOn extends Event {
        public AerationOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            air = true;
        }

        @Override
        public String toString() {
            return "Проветривание включено";
        }
    }

    public class AerationOff extends Event {
        public AerationOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            air = false;
        }

        @Override
        public String toString() {
            return "Проветривание выключено";
        }

    }
}
