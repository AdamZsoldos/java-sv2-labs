package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    private final List<String> roomsToHeat = new ArrayList<>();
    private final List<Thermometer> thermometers = new ArrayList<>();
    private int targetTemperature = 23;

    public List<String> getRoomsToHeat() {
        return roomsToHeat;
    }

    public void addThermometer(Thermometer thermometer) {
        thermometers.add(thermometer);
        thermometer.setObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (temp >= targetTemperature) {
                    roomsToHeat.remove(room);
                } else if (!roomsToHeat.contains(room)) {
                    roomsToHeat.add(room);
                }
            }
        });
    }
}
