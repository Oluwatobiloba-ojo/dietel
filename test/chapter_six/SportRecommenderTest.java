package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SportRecommenderTest {

    @Test
    public void testForSportRecommends(){
        int temperature = 30;
        String result =  Sport.checkWeather(temperature);
        String answer = "It is lovely weather for sport today";
        assertEquals(result, answer);
    }
    @Test
    public void testForSportRecommends2(){
        int temperature = 25;
        String result =  Sport.checkWeather(temperature);
        String answer = "It is lovely weather for sport today";
        assertEquals(result, answer);
    }
    @Test
    public void testForSportRecommends3(){
        int temperature = 21;
        String result =  Sport.checkWeather(temperature);
        String answer = "It is lovely weather for sport today";
        assertEquals(result, answer);
    }
    @Test
    public void testForSportRecommends4(){
        int temperature = 19;
        String result =  Sport.checkWeather(temperature);
        String answer = "It is a reasonable weather for sport today";
        assertEquals(result, answer);
    }
    @Test
    public void testForSportRecommends5(){
        int temperature = 10;
        String result =  Sport.checkWeather(temperature);
        String answer = "It is a reasonable weather for sport today";
        assertEquals(result, answer);
    }
    @Test
    public void testForSportRecommends6(){
        int temperature = 55;
        String result =  Sport.checkWeather(temperature);
        String answer = "Please exercise with care today, watch out for the weather";
        assertEquals(result, answer);
    }

}
