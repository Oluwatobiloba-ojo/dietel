package tdd;

public class Car {
    private String name;
    private int model;
    private double price;
    private int tyres;
    public Car(String name, int model, double price,int tyres) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.tyres = tyres;
    }

    public String getName() {
        return name;
    }

    public int getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getTyres(int numberOfTyre) {
        return tyres;
    }
}
