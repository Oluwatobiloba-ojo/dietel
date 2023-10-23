package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsTest {

    @Test
    public void testThatAnWeCanGetTheSquareDeviationOfAnArray() {
        double[] numbers = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};
        double result = Statistics.deviation(numbers);
        assertEquals(result, 1.557);
    }
    @Test
    public void testForTheStatistics(){
        double [] numbers = {2.0, 5.8, 9.8, 8.1};
        double result = Statistics.deviation(numbers);
        assertEquals(result, 3.375);
    }
}
