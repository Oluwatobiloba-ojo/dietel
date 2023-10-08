import classwork.DataExtraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DataExtractionTest {

    @Test
    public void testSomething(){
        DataExtraction myDataSet = new DataExtraction();
        int [] [] data = {
                {1, 2, 4, 6},
                {3, 4, 7, 8},
                {8, 9, 19, 10},
                {5, 7, 9, 10},
            };
        int row = 2;
        int startPosition = 2;
        int endPosition = 4;
       int [] result =  myDataSet.extract(data, row, startPosition, endPosition);
       int [] expected = {4, 7, 8};
        assertArrayEquals(result, expected);
    }

    @Test
    public void testTheExtractionOfDataSetByColumn(){
        DataExtraction myDataSet = new DataExtraction();
        int [] [] data = {
                {1, 2, 4, 6},
                {3, 8, 7, 8},
                {8, 6, 19, 10},
                {5, 8, 9, 10},
        };
        int column = 2;
        int startPosition = 1;
        int endPosition = 4;
        int [] result =  myDataSet.extractByColumn(data, column, startPosition, endPosition);
        int [] expected = {2, 8, 6, 8};
        assertArrayEquals(result, expected);
    }
    @Test
    public void testThatExtractionOfDataSetByColumn2(){
        DataExtraction myDataSet = new DataExtraction();
        int [] [] data = {
                {1, 2, 4, 6},
                {3, 8, 7, 8},
                {8, 6, 19, 10},
                {5, 8, 9, 10},
        };
        int column = 3;
        int startPosition = 2;
        int endPosition = 4;
        int [] result =  myDataSet.extractByColumn(data, column, startPosition, endPosition);
        int [] expected = {7, 19, 9};
        assertArrayEquals(result, expected);
    }
}
