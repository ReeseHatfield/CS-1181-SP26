import javax.management.modelmbean.ModelMBean;
import java.util.ArrayList;
import java.util.Collections;

public class Transportation2
{
    public static void main(String[] args)
    {
        Boat2 speedBoat = new Boat2(5.0);
        Airplane2 c17 = new Airplane2();
        Train2 chooChoo = new Train2(10, 50);

        ArrayList<ModeOfTransportation2> vehicles = new ArrayList<>();
        vehicles.add(speedBoat);
        vehicles.add(c17);
        vehicles.add(chooChoo);
        System.out.println(vehicles);
        Collections.sort(vehicles);
        System.out.println(vehicles);

        System.out.println(determineFastestMode(speedBoat, c17, 60));

        System.out.println(speedBoat.compareTo(c17));

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
