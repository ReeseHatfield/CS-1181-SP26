public class Transportation
{
    public static void main(String[] args)
    {
        Boat speedBoat = new Boat(5.0);
        Airplane c17 = new Airplane();
        System.out.println(determineFastestMode(speedBoat, c17, 60));

    }

    public static ModeOfTransportation determineFastestMode(ModeOfTransportation a, ModeOfTransportation b, double disp)
    {
        if (a.calcTripTime(disp) > b.calcTripTime(disp))
        {
            return b;
        }
        return a;
    }
}
