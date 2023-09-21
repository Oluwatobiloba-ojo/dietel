package Chapter3Test.tdd;

import org.junit.jupiter.api.Test;
import tdd.AC;

import static org.junit.jupiter.api.Assertions.*;

class ACTest {

    @Test
    public void testThatACExist(){
     AC ac = new AC();
     assertNotNull(ac);
    }

    @Test
    public void testThatAcIsOn(){
       AC ac = new AC();
        assertFalse(ac.isOn());
        ac.toggleOn();
        assertTrue(ac.isOn());
    }

    @Test
    public void testThatAcCanBeOff(){
        AC ac = new AC();
        assertFalse(ac.isOn());
        ac.toggleOn();
        assertTrue(ac.isOn());
        ac.toggleOn();
        assertFalse(ac.isOn());
    }

    @Test
    public void testThatAcCanBeIncrease(){
        AC ac = new AC();
        assertFalse(ac.isOn());
        ac.toggleOn();
        assertTrue(ac.isOn());
        ac.increaseTemperature(16);
        assertEquals(16,ac.getTemperature());

    }

    @Test
    public void testThatAcCanBeDecreased(){
        AC ac = new AC();
        assertFalse(ac.isOn());
        ac.toggleOn();
        assertTrue(ac.isOn());
        ac.decreaseTemperature(16);
        assertEquals(17,ac.getTemperature());

    }

    @Test
    public void testThatAcCanNotBeIncreasedBeyond16(){
        AC ac = new AC();
        assertFalse(ac.isOn());
        ac.toggleOn();
        assertTrue(ac.isOn());
        ac.increaseTemperature(16);
        assertEquals(15,ac.getTemperature());
    }

    @Test
    public void testThatAcCanNotBeDecreaseBeyond30(){
        AC ac = new AC();
        assertFalse(ac.isOn());
        ac.toggleOn();
        assertTrue(ac.isOn());
        ac.decreaseTemperature(29);
        assertEquals(30,ac.getTemperature());
    }
}