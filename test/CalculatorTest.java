import calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testForTheSumUpOfThreeDifferentNumbers(){
        Calculator myCalculator = new Calculator();
        assertEquals(myCalculator.calculate("2+3+5"), 10);
    }
    @Test
    public void testForTheProductOfThreeDifferentNumbers(){
        Calculator myCalculator = new Calculator();
        assertEquals(myCalculator.calculate("2*3*5"), 30);
    }

    @Test
    public void testForTheAdditionalArithmeticOperationOnAnExpression(){
        Calculator myCalculator = new Calculator();
        assertEquals(myCalculator.calculate("2+3-4+5*6/2"), 16);
    }
}
