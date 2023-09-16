package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticsTest {
    @Test
    public void testThatLogisticsCanCalculateRightAllowanceForPercentage80(){
        int result = Logistics.allowance(80);
        assertEquals(45000,result);
    }
    @Test
    public void testThatLogisticsCanCalculateCertainPercentage25(){
        int allowance = Logistics.allowance(25);
        assertEquals(9000,allowance);
    }
    @Test
    public void testThatLogisticsCanCalculateAllowanceForPercentageBetween60to69(){
        int allowance = Logistics.allowance(65);
        assertEquals(21250,allowance);
    }
    @Test
    public void testThatLogisticsCanCalculateAllowanceForPercentageBetween50to59(){
        int allowance = Logistics.allowance(55);
        assertEquals(16000,allowance);
    }
}
