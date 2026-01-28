import java.util.ArrayList;
import java.util.List;

public class WeatherRecord
{
    public enum WeatherType {SUNNY, CLOUDY, RAIN, STORM, SNOW};

    private WeatherType currType = WeatherType.SUNNY;
    private double totalAccumulation = 0.0;
    private List<Double> measuredTemps = new ArrayList<>();
    private double averageTemp = 70.0;

    public WeatherRecord(WeatherType type, double accumulation, List<Double> temps)
    {
        currType = type;
        totalAccumulation = accumulation;
        measuredTemps = temps;
        setAvgTemp();
    }

    public WeatherRecord(WeatherRecord originalCopy)
    {
        currType = originalCopy.currType;
        totalAccumulation = originalCopy.totalAccumulation;
        measuredTemps = new ArrayList<>(originalCopy.measuredTemps);
        setAvgTemp();
    }

    /**
     * Calculates the average temperature based on the measured temperatures
     * @return a boolean to indicate whether the operation was successful
     */
    public boolean setAvgTemp()
    {
        double sum = 0.0;
        int count = 0;
        for (double temp : measuredTemps)
        {
            sum = sum + temp;
            count++;
        }
        try
        {
            averageTemp = sum / count;
            return true;
        }
        catch (ArithmeticException ae)
        {
            return false;
        }
    }

    /**
     * updates the totalAccumulation
     * @param newAccumulation new desired accumulation total
     */
    public void setTotalAccumulation(double newAccumulation)
    {
        totalAccumulation = newAccumulation;
    }

    /**
     * gets the measured temps
     * @return a MODIFIABLE List of the measured temps
     */
    public List<Double> getMeasuredTemps()
    {
        return measuredTemps;
    }

    /**
     * converts the relevant class information into a human-readable String
     * @return weather record information in String format
     */
    public String toString()
    {
        return "RECORD: " + currType + ((totalAccumulation > 0) ? " [Accumulation: " + totalAccumulation + "] " : " ") + "Temps: " + measuredTemps;
    }
}
