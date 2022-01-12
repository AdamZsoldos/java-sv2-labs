package nestedclasses.thermo;

public class Thermometer {

    private String room;
    private int temperature;
    private ThermometerObserver observer;

    public Thermometer(String room, int temperature) {
        this.room = room;
        this.temperature = temperature;
        this.observer = null;
    }

    public String getRoom() {
        return room;
    }

    public int getTemperature() {
        return temperature;
    }

    public ThermometerObserver getObserver() {
        return observer;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        onTemperatureChange();
    }

    public void setObserver(ThermometerObserver observer) {
        this.observer = observer;
        onTemperatureChange();
    }

    private void onTemperatureChange() {
        if (observer != null) {
            observer.handleTemperatureChange(temperature, room);
        }
    }
}
