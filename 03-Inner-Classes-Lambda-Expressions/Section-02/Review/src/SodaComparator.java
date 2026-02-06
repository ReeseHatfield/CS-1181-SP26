import java.util.Comparator;

// Collections.sort(list, new SodaComparator) -> comparator
// Collections.sort(list) -> comparable


public class SodaComparator implements Comparator<Soda>{

    @Override
    public int compare(Soda s1, Soda s2) {



        return s1.getName().compareTo(s2.getName());
    }
    
}
