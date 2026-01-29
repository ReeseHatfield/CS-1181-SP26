import java.util.*;

public class Driver {


    public static void main(String[] args) {


        // inner class
        // better encapsulation
        class InnerUserComparator implements Comparator<User>{

            @Override
            public int compare(User u1, User u2) {
                return u1.getFavoriteNumber().compareTo(u2.getFavoriteNumber());
            }

        }

        // anonymous inner class
        Comparator<User> anonComparator = new Comparator<User>(){

            @Override
            public int compare(User u1, User u2){
                return u1.getFavoriteNumber().compareTo(u2.getFavoriteNumber());
            }

        };


        CargoHolder h = new CargoHolder() {
            

            @Override
            public void load(){
                System.out.println("Loads cargo");
            }

            @Override
            public void remove(){
            System.out.println("removes cargo");
            }
        };

        h.load();
        h.remove();

        Comparator<User> lambdaComparator = (u1, u2) -> {
            return u1.getFavoriteNumber().compareTo(u2.getFavoriteNumber());
        };


        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Alice", 1, 5.5));
        users.add(new User("Bob", 6, 6.5));
        users.add(new User("Charlie", 3, 3.14));
        users.add(new User("Derek", 4, 2.7));
        users.add(new User("Frank", 2, 5.7));

        Collections.sort(users, (u1, u2) -> {
            return u1.getFavoriteNumber().compareTo(u2.getFavoriteNumber());
        });
        // Collections.sort(users);

        System.out.println(users);

        Commuter c = () -> {
            System.out.println("commutes to wsu in the snow");
        };


        c.commute();


    }
}