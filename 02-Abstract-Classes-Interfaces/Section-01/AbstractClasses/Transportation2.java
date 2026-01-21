public class Transportation2
{
    public static void main(String[] args)
    {
        Boat2 speedBoat = new Boat2(5.0);
        Airplane2 c17 = new Airplane2();
        System.out.println(determineFastestMode(speedBoat, c17, 60));

    }

    public static ModeOfTransportation2 determineFastestMode(ModeOfTransportation2 a, ModeOfTransportation2 b, double disp)
    {
        if (a.calcTripTime(disp) > b.calcTripTime(disp))
        {
            return b;
        }
        return a;
    }
}
