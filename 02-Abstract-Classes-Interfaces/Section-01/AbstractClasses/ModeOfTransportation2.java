public abstract class ModeOfTransportation2
{
    private double currPos = 0.0;
    private double speed = 0.0;

    public ModeOfTransportation2(double currPos, double speed)
    {
        this.currPos = currPos;
        this.speed = speed;
    }

    public void move(double disp)
    {
        currPos = currPos + disp;
    }

    public double calcTripTime(double disp)
    {
        return disp / speed;
    }

    public void setSpeed(double newSpeed)
    {
        this.speed = newSpeed;
    }

    public double getSpeed()
    {
        return this.speed;
    }
}
