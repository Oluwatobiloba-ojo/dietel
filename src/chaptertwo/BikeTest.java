package chaptertwo;

public class BikeTest {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.setName("Motorola");

        myBike.setOn(true);
        System.out.printf("The name of the bike is %s and bike is %s",myBike.getName(),myBike.isOn()? "On":"Off");
    }
}
