import java.util.Random;

public class Airplane2 extends AerialVehicle2
{
    private boolean isHeadwind = true;
    private Random rng = new Random();
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
        return "Airplane: speed- " + super.getSpeed() + "position- " + super.getPosition();
    }

    @Override
    public void takeOff()
    {
        if (rng.nextBoolean())
        {
            System.out.println("Take off was successful!!");
        }
        else
        {
            System.out.println("Take off was unsuccessful!!");
        }
    }
}
