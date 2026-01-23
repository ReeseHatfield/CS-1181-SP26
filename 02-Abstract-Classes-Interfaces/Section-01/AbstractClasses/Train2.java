public class Train2 extends ModeOfTransportation2
{
    public Train2(double speed, double pos)
    {
        super(pos, speed);
    }

    public void changeTrainSpeed(double newSpeed)
    {
        if (newSpeed >= 0)
        {
            super.setSpeed(newSpeed);
        }
    }

    public String toString()
    {
        return "Train: speed- " + super.getSpeed() + " position- " + super.getPosition();
    }
}
