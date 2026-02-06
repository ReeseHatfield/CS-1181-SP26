import java.util.*;


public class LaptopComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop l1, Laptop l2) {
        if(l1.getSpeed() < l2.getSpeed()){
            return +1;
        }
        else if(l1.getSpeed() > l2.getSpeed()){
            return -1;
        }
        else {
            return 0;
        }
    }
    
}
