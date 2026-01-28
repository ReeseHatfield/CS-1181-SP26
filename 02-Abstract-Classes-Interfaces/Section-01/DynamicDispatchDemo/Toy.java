public class Toy implements Purchasable
{
    private String toyName = "";
    private boolean usesAI = true;
    private int numBatteriesRequired = 5;

    public Toy(String toyName, boolean usesAI, int numBatteriesRequired)
    {
        this.toyName = toyName;
        this.usesAI = usesAI;
        this.numBatteriesRequired = numBatteriesRequired;
    }

    @Override
    public double getPrice()
    {
        return numBatteriesRequired * (usesAI ? 700 : 2);
    }

    @Override
    public String toString()
    {
        return "Toy{" +
                "toyName='" + toyName + '\'' +
                ", usesAI=" + usesAI +
                ", numBatteriesRequired=" + numBatteriesRequired +
                '}';
    }

    public boolean isUsesAI()
    {
        return usesAI;
    }

    public void setUsesAI(boolean usesAI)
    {
        this.usesAI = usesAI;
    }

    public int getNumBatteriesRequired()
    {
        return numBatteriesRequired;
    }

    public void setNumBatteriesRequired(int numBatteriesRequired)
    {
        this.numBatteriesRequired = numBatteriesRequired;
    }
}
