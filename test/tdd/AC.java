package tdd;

public class AC {
    private boolean isOn;
    private int temperature;


    public void toggleOn() {
        if (!isOn) {
            isOn = true;
        } else {
            isOn = false;
        }
    }
    public boolean isOn() {
        return isOn;
    }

    public void increaseTemperature(int initialTemperature) {
        if ( isOn && initialTemperature < 30) {
            this.temperature = initialTemperature - 1;
        } else if (isOn && this.temperature == 16) {
            temperature = initialTemperature;
        }
    }
    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int temperature) {
        if (temperature < 30) {
            this.temperature = temperature + 1;
        }
    }
}
