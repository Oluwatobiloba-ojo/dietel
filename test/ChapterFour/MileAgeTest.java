package ChapterFour;

import chapter_4.MileAgesample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MileAgeTest {
    MileAgesample myMileAge;

    @BeforeEach
    public void setOn(){
        myMileAge = new MileAgesample();
    }

    @Test
    public void testMileAgeExist(){
        assertNotNull(myMileAge);
    }

    @Test
    public void testThatMIleAgeCanReceiveMilesDriven(){
        myMileAge.setMiles(32);
        assertEquals(32, myMileAge.getMiles());
    }

    @Test
    public void testThatMilesAgeCanReceiveGallonUsedForMiles(){
        myMileAge.setMiles(3000);
        assertEquals(3000, myMileAge.getMiles());

        myMileAge.setGallon(300);
        assertEquals(300,myMileAge.getGallon());
    }

    @Test
    public void testThatMilesAgeCanCalculateAverageMilesPerGallon(){
        myMileAge.setMiles(3000);
        assertEquals(3000, myMileAge.getMiles());

        myMileAge.setGallon(35);
        assertEquals(35,myMileAge.getGallon());

        myMileAge.calculateAverage();
        double result = (double) 3000 / 35;
        assertEquals(result, myMileAge.checkCalculation());
    }

    @Test
    public void testThatMilesAgeCanCalculate(){
        myMileAge.setMiles(12000);
        assertEquals(12000,myMileAge.getMiles());

        myMileAge.setGallon(120);
        assertEquals(120,myMileAge.getGallon());

        myMileAge.calculateAverage();
        double result = (double) 12000 / 120;
        assertEquals(result,myMileAge.checkCalculation());

    }
}
