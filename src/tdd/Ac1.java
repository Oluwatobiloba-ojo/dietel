package tdd;

public class Ac1 {
    private boolean isOn;
    private int temperature = 16;
    public void switchOn() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void increaseTemperature() {
        if (isOn && temperature < 30){this.temperature = temperature + 1;}
        if (isOn && temperature > 30){System.out.println(temperature);}
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16){this.temperature = temperature - 1;}
        if(isOn && temperature == 16){System.out.println(temperature);}
    }
}
