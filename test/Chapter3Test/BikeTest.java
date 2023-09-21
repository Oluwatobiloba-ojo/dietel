package Chapter3Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Bike2;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    Bike2 myBike;
    @BeforeEach
    public void setUp(){
        myBike = new Bike2();
    }

    @Test
    public void testMyBikeIsOn() {
        // GIVEN
        assertFalse(myBike.isOn());
        // WHEN
        myBike.keyOn();
        //CHECK
        assertTrue(myBike.isOn());
    }

    @Test
    public void testThatMyBikeCanBeOffWhenOn() {
        myBike.keyOn();
        assertTrue(myBike.isOn());
        myBike.keyOn();
        assertFalse(myBike.isOn());
    }

    @Test
    public void testThatMyBikeSpeedCanIncreaseWhenBikeIsInGearOne() {
        myBike.keyOn();
        for (int index = 1; index <= 20; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(20, myBike.getSpeed());
    }

    @Test
    public void testThatWhenBikeIsOnGearTwoIncreasedByTwo() {
        myBike.keyOn();
        for (int index = 1; index <= 20; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(20, myBike.getSpeed());
        for (int index = 1; index <= 3; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(26, myBike.getSpeed());
    }

    @Test
    public void testThatWhenBikeIsOnGearThreeItIncreaseByThree() {
        myBike.keyOn();
        for (int index = 1; index <= 20; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(20, myBike.getSpeed());
        for (int index = 1; index <= 5; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(30, myBike.getSpeed());
        for (int index = 1; index <= 3; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(38, myBike.getSpeed());
    }

    @Test
    public void testThatBikeWhenOnGearFourIncreaseByFour() {
        myBike.keyOn();
        for (int index = 1; index <= 20; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(20, myBike.getSpeed());
        for (int index = 1; index <= 5; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(30, myBike.getSpeed());
        for (int index = 1; index <= 4; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(41, myBike.getSpeed());
        for (int index = 1; index <= 2; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(49, myBike.getSpeed());
    }

    @Test
    public void testThatWhenBikeIsOnGearOneDecelerateByOne() {
        myBike.keyOn();
        for (int index = 1; index <= 15; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(15, myBike.getSpeed());
        myBike.decelerateSpeed();
        assertEquals(14, myBike.getSpeed());
    }

    @Test
    public void testThatWhenBikeIsOnGearTwoDecelerateByTwo() {
        myBike.keyOn();
        for (int index = 1; index <= 22; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(24, myBike.getSpeed());
        myBike.decelerateSpeed();
        assertEquals(22, myBike.getSpeed());
    }

    @Test
    public void testThatWhenBikeIsOnGearThreeDecelerateByThree() {
        myBike.keyOn();
        for (int index = 1; index <= 27; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(35, myBike.getSpeed());
        myBike.decelerateSpeed();
        assertEquals(32, myBike.getSpeed());
    }

    @Test
    public void testThatWhenBikeIsOnGearFourDecelerateByFour() {
        myBike.keyOn();
        for (int index = 1; index <= 30; index++) {
            myBike.accelerateSpeed();
        }
        assertEquals(45, myBike.getSpeed());
        myBike.decelerateSpeed();
        assertEquals(41, myBike.getSpeed());
    }

    @Test
    public void testThatBikeCanNotBeDecreasedWhenNotIncreased() {
        myBike.keyOn();
        myBike.decelerateSpeed();
        myBike.decelerateSpeed();
        myBike.decelerateSpeed();
        assertEquals(0, myBike.getSpeed());
    }
}
