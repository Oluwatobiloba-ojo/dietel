package chapter_six;

public class Sport {

    public static String checkWeather(int temperature) {
        String result = "";
        if (temperature > 20 && temperature <= 30){
            result = "It is lovely weather for sport today";
        } else if (temperature >= 10 && temperature <= 20) {
            result = "It is a reasonable weather for sport today";
        }else {
            result = "Please exercise with care today, watch out for the weather";
        }
        return result;
    }
}
