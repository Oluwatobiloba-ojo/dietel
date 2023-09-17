package Chapter3Test.tdd;

import org.junit.jupiter.api.Test;
import tdd.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void testThatCarExist(){
        Car myCar = new Car("Toyota", 2021, 746535,3);
        assertNotNull(myCar);
    }

    @Test
    public void testThatCarHasAName() {
        Car myCar = new Car("Camry",2020, 25346,2);
        String name = myCar.getName();
        assertNotNull("Camry",name);
    }

    @Test
    public void testThatCarHasAModel() {
        Car myCar = new Car("Benz",2020, 956978,2);
        String name = myCar.getName();
        assertNotNull("Benz", name);
        int model = myCar.getModel();
        assertEquals(2020,model);
    }

    @Test
    public void testThatCarHasAPrice(){
        Car myCar = new Car("Lexus",2021, 589979,3);
        String name = myCar.getName();
        assertNotNull("Lexus",name);
        int model = myCar.getModel();
        assertEquals(2021,model);
        double price = myCar.getPrice();
        assertEquals(589979,price);
    }

    @Test
    public void testThatACarHasTyres(){
        Car myCar = new Car("Motorola",2019,34255,4);
        String name = myCar.getName();
        assertNotNull("Motorola",name);
        int model = myCar.getModel();
        assertEquals(2019,model);
        double price = myCar.getPrice();
        int tyre = myCar.getTyres(4);
        assertEquals(4,tyre);
    }
}