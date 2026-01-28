public class Food implements Purchasable
{
    private String foodType = "";
    private int numCalories = 0;
    private boolean isHealthy = true;

    public Food(String foodType, int numCalories, boolean isHealthy)
    {
        this.foodType = foodType;
        this.numCalories = numCalories;
        this.isHealthy = isHealthy;
    }

    @Override
    public double getPrice()
    {
        int multiplier = 1;
        if (isHealthy)
        {
            multiplier = 5;
        }
        return numCalories * multiplier;
    }

    @Override
    public String toString()
    {
        return "Food{" +
                "foodType='" + foodType + '\'' +
                ", numCalories=" + numCalories +
                ", isHealthy=" + isHealthy +
                '}';
    }

    public String getFoodType()
    {
        return foodType;
    }

    public void setFoodType(String foodType)
    {
        this.foodType = foodType;
    }

    public int getNumCalories()
    {
        return numCalories;
    }

    public void setNumCalories(int numCalories)
    {
        this.numCalories = numCalories;
    }

    public boolean isHealthy()
    {
        return isHealthy;
    }

    public void setHealthy(boolean healthy)
    {
        isHealthy = healthy;
    }
}
