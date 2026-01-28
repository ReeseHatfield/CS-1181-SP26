public class Clothing implements Purchasable
{
    private String clothingType = "";
    private int threadCount = 500;

    public Clothing(String clothingType, int threadCount)
    {
        this.clothingType = clothingType;
        this.threadCount = threadCount;
    }

    @Override
    public double getPrice()
    {
        return threadCount * 0.5;
    }

    @Override
    public String toString()
    {
        return "Clothing{" +
                "clothingType='" + clothingType + '\'' +
                ", threadCount=" + threadCount +
                '}';
    }

    public String getClothingType()
    {
        return clothingType;
    }

    public void setClothingType(String clothingType)
    {
        this.clothingType = clothingType;
    }

    public int getThreadCount()
    {
        return threadCount;
    }

    public void setThreadCount(int threadCount)
    {
        this.threadCount = threadCount;
    }
}
