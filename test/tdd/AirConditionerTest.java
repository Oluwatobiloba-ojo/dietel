package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.AirConditioner;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    AirConditioner hisense;
    @BeforeEach
    public void setUp(){
        hisense = new AirConditioner();
    }


    @Test
    public void testThatAirConditionerExist() {
        assertNotNull(hisense);
    }

    @Test
    public void testThatAirConditionerCanBeOn() {
        assertFalse(hisense.isOn());
        hisense.toggleOn();
        assertTrue(hisense.isOn());
    }

    @Test
    public void testThatAirConditionerCanBeOffWhenTurnedOn(){
        hisense.toggleOn();
        assertTrue(hisense.isOn());
        hisense.toggleOn();
        assertFalse(hisense.isOn());

    }

    @Test
    public void testThatAirConditionerCanIncreaseTemperatureWhenItIsDecreased(){
        hisense.toggleOn();
        assertTrue(hisense.isOn());

        hisense.decreaseTemperature();
        assertEquals(17,hisense.getTemperature());

        hisense.decreaseTemperature();
        assertEquals(18,hisense.getTemperature());

        hisense.increaseTemperature();
        int temperature1 = hisense.getTemperature();
        assertEquals(17,temperature1);
    }


    @Test
    public void testThatIAirConditionerCanDecreaseTemperature(){
        hisense.toggleOn();
        assertTrue(hisense.isOn());

        hisense.decreaseTemperature();
        assertEquals(17,hisense.getTemperature());

        hisense.decreaseTemperature();
        assertEquals(18,hisense.getTemperature());
    }

    @Test
    public void testThatTemperatureCanNotBeDecreasedBeyond30() {
        hisense.toggleOn();
        assertTrue(hisense.isOn());

            hisense.decreaseTemperature();
            assertEquals(17, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(18, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(19, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(20, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(21, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(22, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(23, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(24, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(25, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(26, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(27, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(28, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(29, hisense.getTemperature());

            hisense.decreaseTemperature();
            assertEquals(30, hisense.getTemperature());

        hisense.decreaseTemperature();
        assertEquals(30,hisense.getTemperature());
    }


    @Test
    public void testThatTemperatureCanNotBeIncreasedBeyond16() {
        hisense.toggleOn();
        assertTrue(hisense.isOn());

        assertEquals(16,hisense.getTemperature());

        hisense.increaseTemperature();
        int temperature1 = hisense.getTemperature();
        assertEquals(16,temperature1);
    }
}