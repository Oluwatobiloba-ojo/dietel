package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    @Test
    public void testThatTestDrillerCanCalculateTwoNumberOfCopy(){
        int costOfCopies = TestDriller.amountOfCopy(2);
        assertEquals(4000,costOfCopies);
    }
    @Test
    public void testThatTestDrillerCanCalculateCostOfFiveCopies(){
        int costOfCopes = TestDriller.amountOfCopy(5);
        assertEquals(9000,costOfCopes);
    }
    @Test
    public void testThatTestDrillerCanCalculateCostOfElevenCopies(){
        int costOfCopies = TestDriller.amountOfCopy(11);
        assertEquals(17600,costOfCopies);
    }
    @Test
    public void testThatTestDrillerCanCalculateCostOfThirtyCopies(){
        int costOfCopies = TestDriller.amountOfCopy(30);
        assertEquals(45000, costOfCopies);
    }
    @Test
    public void testThatTestDrillerCanCalculateCostOfSixtyCopies(){
        int costOfCopies = TestDriller.amountOfCopy(60);
        assertEquals(78000,costOfCopies);
    }
    @Test
    public void testThatTestDrillerCanCalculateCostOfOneHundredCopies(){
        int costOfCopies = TestDriller.amountOfCopy(100);
        assertEquals(120000,costOfCopies);
    }
    @Test
    public void testThatTestDrillerCanCalculateCostOfTwoHundredCopies(){
        int costOfCopies = TestDriller.amountOfCopy(200);
        assertEquals(220000,costOfCopies);
    }
    @Test
    public void testThatTestDrillerCanCalculateCostOfCopiesAboveFiveHundred(){
        int costOfCopies = TestDriller.amountOfCopy(500);
        assertEquals(500000,costOfCopies);
    }
}
