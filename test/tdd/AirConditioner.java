package tdd;

public class AirConditioner {
    private boolean isOn;
    private int temperature = 16;

    public boolean isOn() {
        return isOn;
    }

    public void toggleOn() {
        if (!isOn){
            isOn = true;
        }else  {
            isOn = false;
        }


    }

    public void increaseTemperature() {
        if (temperature > 16) {
            temperature = temperature - 1;
        }else if (temperature == 16) {
            System.out.println("Air-conditioner is already high already");
        }

    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature < 30) {
            temperature = temperature + 1;
        } else if (temperature > 30) {
            System.out.println("Air-conditioner has reach it level of decrease");
        }
    }
}