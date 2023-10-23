package liangexcercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometryTest {

    @Test
    public void testForTheComputingOfAnAreaOfPolygon(){
        double vertex = 5.5;
        double result = Geometry.areaPentagon(vertex);
        assertEquals(result, 71.92);
    }
    @Test
    public void testForTheAreaOfHexagon(){
        double side = 5.5;
        double result = Geometry.areaHexagon(side);
        assertEquals(78.59, result);
    }
    @Test
    public void testForTheAreaOfARegularPolygon(){
        double side = 6.5;
        int numberOfSide= 5;
        double result = Geometry.areaPolygon(side, numberOfSide);
        assertEquals(72.69, result);
    }

}
