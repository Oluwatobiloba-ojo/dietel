package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {

    @Test
    public void testForTheConversionOfCelsiusToKelvin(){
        double temperate = 230.0;
        double convertCelsiusToKelvin = Temperature.convertKelvin(temperate);
        double result = 503.15;
        assertEquals(convertCelsiusToKelvin, result);
    }
    @Test
    public void testForTheConversionOfKelvinToCelsius(){
        double temperate = 315.0;
        double convertKelvinToCelsius = Temperature.convertCelsius(temperate);
        double result = 41.85;
        assertEquals(convertKelvinToCelsius, result);
    }
    @Test
    public void testForTheConversionOfKelvinToCelsius2(){
        double temperate = 315.0;
        double convertKelvinToCelsius = Temperature.convert(temperate);
        double result = 41.85;
        assertEquals(convertKelvinToCelsius, result);
    }
    @Test
    public void testForTheConversionOfCelsiusToKelvin2(){
        double temperate = 230.0;
        double convertCelsiusToKelvin = Temperature.convert(temperate);
        double result = 503.15;
        assertEquals(convertCelsiusToKelvin, result);
    }
    @Test
    public void testForTheConversionOfATemperature(){
        double temperature = 273.15;
        double result = Temperature.convert(temperature);
        double answer = 546.3;
        assertEquals(answer, result);
    }
}
