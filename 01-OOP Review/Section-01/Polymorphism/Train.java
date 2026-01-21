public class Train extends ModeOfTransportation
{
    public Train(double speed, double pos)
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
