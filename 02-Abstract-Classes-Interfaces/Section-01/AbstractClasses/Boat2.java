public class Boat2 extends ModeOfTransportation2
{
    public Boat2(double pos)
    {
        super(pos, 10.0);
    }

    public String toString()
    {
        return "Boat: " + super.getSpeed();
    }
}
