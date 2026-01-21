public class Train2 extends ModeOfTransportation2
{
    public Train2(double speed, double pos)
    {
        super(speed, pos);
    }

    public void changeTrainSpeed(double newSpeed)
    {
        if (newSpeed >= 0)
        {
            super.setSpeed(newSpeed);
        }
    }
}
