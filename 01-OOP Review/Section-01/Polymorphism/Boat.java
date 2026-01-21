public class Boat extends ModeOfTransportation
{
    public Boat (double pos)
    {
        super(pos, 10.0);
    }

    public String toString()
    {
        return "Boat: " + super.getSpeed();
    }
}
