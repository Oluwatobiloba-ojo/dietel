package ChapterFour;

import chapter_4.SalesCalculatorSample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalesCalculatorTest {
    @Test
    public void testThatCalculatorExist(){
        SalesCalculatorSample myCalculator = new SalesCalculatorSample();
        assertNotNull(myCalculator);
    }
    @Test
    public void testThatSalesCalculatorCanCollectTheCostOfAnItem(){
        SalesCalculatorSample mySales = new SalesCalculatorSample();
        double result =  mySales.calculateGrossPay(5000);
        assertEquals(650.00, result);
    }

    @Test
    public void testThatSalesCalculatorCanCalculateMoreThanOneItem(){
        SalesCalculatorSample mySales = new SalesCalculatorSample();
       double result = mySales.calculateItemForMoreThanOne(239.99, 129.75, 99.95, 350.89);
        assertEquals(273.85, result);
    }

}
