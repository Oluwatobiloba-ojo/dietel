package ChapterFour;

import chapter_4.TaxCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaxCalculatorTest {
    TaxCalculator myTax;
    @BeforeEach
    public void setUp(){
        myTax = new TaxCalculator();
    }
    @Test
    public void testThatTaxCalculatorExist(){
        assertNotNull(myTax);
    }
    @Test
    public void testThatTaxCalculatorCanStoreAName(){
        myTax.setName("Ojo tobi");
        assertEquals("Ojo tobi", myTax.getName());
    }
    @Test
    public void testThatTaxCalculatorCanCalculateTaxRateBelow30_000(){
        myTax.setName("Ope");
        assertEquals("Ope",myTax.getName());

        myTax.calculateTax(30_000);
        assertEquals(4500,myTax.checkTaxRate());
    }
    @Test
    public void testThatTaxCalculatorCanCalculateTaxRateAbove30_000(){
        myTax.setName("Delight");
        assertEquals("Delight",myTax.getName());

        myTax.calculateTax(60_000);
        assertEquals(12000,myTax.checkTaxRate());
    }
}
