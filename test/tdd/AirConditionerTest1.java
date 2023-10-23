package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest1 {


    @Test
    public void testThatAirConditionerExist(){
        Ac1 myAc = new Ac1();
        assertNotNull(myAc);
    }
    @Test
    public void testThatAirConditionerCanBeOn() {
        Ac1 myAc = new Ac1();
        myAc.switchOn();
        assertTrue(myAc.isOn());
    }
    @Test
    public void testThatAirConditionerCanBeOffWhenItsOn(){
        Ac1 myAc = new Ac1();
        myAc.switchOn();
        myAc.switchOn();
        assertFalse(myAc.isOn());
    }
    @Test
    public void testThatAirConditionerCanBeIncreasedInTemperature(){
        Ac1 myAc = new Ac1();
        myAc.switchOn();

        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();

        assertEquals(19,myAc.getTemperature());
    }
    @Test
    public void testThatAirConditionerCanBeDecreasedInTemperature(){
        Ac1 myAc = new Ac1();
        myAc.switchOn();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        assertEquals(20,myAc.getTemperature());

        myAc.decreaseTemperature();
        myAc.decreaseTemperature();
        assertEquals(18,myAc.getTemperature());
    }
    @Test
    public void testThatAirConditionerCanNotBeIncreasedBeyond30(){
        Ac1 myAc = new Ac1();
        myAc.switchOn();
        for(int a = 16; a <= 30; a++){
            myAc.increaseTemperature();
        }assertEquals(30,myAc.getTemperature());

        myAc.increaseTemperature();
        assertEquals(30,myAc.getTemperature());
    }
    @Test
    public void testThatAirConditionerCanNotBeDecreasedBelow16(){
        Ac1 myAc = new Ac1();
        myAc.switchOn();

        myAc.decreaseTemperature();
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getTemperature());
    }
}
