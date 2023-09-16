package tdd;

public class Bike2 {
    private boolean isOn;
    ;
    private int speed;

    public void keyOn() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void accelerateSpeed() {
        if (isOn && speed < 20) {
            this.speed = speed + 1;
        } else if (isOn && speed == 21 || speed <= 30) {
            this.speed = speed + 2;
        } else if (isOn && speed == 31 || speed <= 40) {
            this.speed = speed + 3;
        } else if (isOn && speed >= 40) this.speed = speed + 4;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void decelerateSpeed() {
        if (isOn && speed < 20 && speed > 0) {
            this.speed = speed - 1;
        } else if (isOn && speed == 21 || speed <= 30 && speed > 0) {
            this.speed = speed - 2;
        } else if (isOn && speed == 31 || speed <= 40 && speed > 0) {
            this.speed = speed - 3;
        } else if (isOn && speed >= 41) {
            this.speed = speed - 4;
        } else if (isOn && speed <= 20) {
            this.speed = 0;
        }
    }
}
