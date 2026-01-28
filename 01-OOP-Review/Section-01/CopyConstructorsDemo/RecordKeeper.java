import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecordKeeper
{
    public static void main(String[] args)
    {
        WeatherRecord beavercreek = new WeatherRecord(WeatherRecord.WeatherType.SNOW, 11.5,
                new ArrayList<>(Arrays.asList(-1.0, 3.0, 5.4, 8.0, 11.3, 7.6, 3.2, 0.1)));
        WeatherRecord fairborn = new WeatherRecord(beavercreek);

        System.out.println("BEFORE MODIFICATION\n-------------------");
        System.out.println("BEAVERCREEK " + beavercreek);
        System.out.println("FAIRBORN " + fairborn);

        fairborn.setTotalAccumulation(12.3);
        List<Double> fairbornTemps = fairborn.getMeasuredTemps();
        fairbornTemps.set(4, 9.5);

        System.out.println("\nAFTER MODIFICATION\n------------------");
        System.out.println("BEAVERCREEK " + beavercreek);
        System.out.println("FAIRBORN " + fairborn);
    }
}
