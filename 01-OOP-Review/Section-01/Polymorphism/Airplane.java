public class Airplane extends AerialVehicle
{
    private boolean isHeadwind = true;
    // created implicitly
//    public Airplane()
//    {
//        super();
//    }

    public void setHeadwind(boolean newIsHeadwind)
    {
        this.isHeadwind = newIsHeadwind;
    }

    @Override
    public double calcTripTime(double disp)
    {
        // MUST use the super keyword here, otherwise will recurse infinitely
        double tripTime = super.calcTripTime(disp);
        if (isHeadwind)
        {
            tripTime = tripTime + 50;
        }
        else
        {
            tripTime = tripTime - 50;
        }
        return tripTime;
    }

    public String toString()
    {
        return "Airplane: " + super.getSpeed();
    }
}
