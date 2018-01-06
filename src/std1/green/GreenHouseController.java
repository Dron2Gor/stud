package std1.green;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GreenHouseController {
    public static void main(String[] args) {
        GreenhouseControls gc=new GreenhouseControls();
        GreenHouseControlsNew gcn=new GreenHouseControlsNew();
        gc.addEvent(gc.new Bell(900));
        List<Event> eventList =new LinkedList<>(Arrays.asList(
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new AerationOn(100),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new AerationOff(100),
                gcn.new HumidificationOn(100),
                gcn.new HumidificationOff(100)
            ));
    gc.addEvent(gc.new Restart(2000, eventList));
    gc.addEvent(gc.new AerationOn(100));

    if (args.length==1)gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));

    gc.run();
    }

}
