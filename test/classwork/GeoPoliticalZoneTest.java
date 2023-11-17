package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class GeoPoliticalZoneTest {

    @Test
    public void testForTheInputOfAStateGivesOutTheGeopoliticalZoneOfTheState(){
        String input = "EKITI";
        GeoPolitical political = GeoPolitical.SOUTH_WEST;
        assertSame(political, GeoPolitical.zone(input));
    }

    @Test
    public void testForTheInputOfAdamawaGivesOutTheGeopoliticalZoneOfTheState(){
        String input = "Adamawa";
        GeoPolitical political = GeoPolitical.NORTH_EAST;
        assertSame(political, GeoPolitical.zone(input));
    }

    @Test
    public void testForTheInputOfImoGivesOutTheGeopoliticalZoneOfTheState(){
        String input = "imo";
        GeoPolitical political = GeoPolitical.SOUTH_EAST;
        assertSame(political, GeoPolitical.zone(input));
    }

    @Test
    public void testForTheInputOfOsunGivesOutTheGeopoliticalZoneOfTheState(){
        String input = "osun";
        GeoPolitical political = GeoPolitical.SOUTH_WEST;
        assertSame(political, GeoPolitical.zone(input));
    }


}
