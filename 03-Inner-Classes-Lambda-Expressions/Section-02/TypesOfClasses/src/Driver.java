import java.util.*;

public class Driver {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Alice", 1, 5.5));
        users.add(new User("Bob", 6, 6.5));
        users.add(new User("Charlie", 3, 3.14));
        users.add(new User("Derek", 4, 2.7));
        users.add(new User("Frank", 2, 5.7));

        class Student {
            private int uid;
        }

        // inner class
        // class UserComparator implements Comparator<User> {

        // @Override
        // public int compare(User u1, User u2) {
        // if(u1.getFavoriteNumber() > u2.getFavoriteNumber()){
        // return -1;
        // }
        // else if(u1.getFavoriteNumber() < u2.getFavoriteNumber()){
        // return +1;
        // }
        // else {
        // return 0;
        // }
        // }

        // }

        // anonymous inner class
        Comparator<User> c = new Comparator<User>() {

            @Override
            public int compare(User u1, User u2) {
                if (u1.getFavoriteNumber() > u2.getFavoriteNumber()) {
                    return -1;
                } else if (u1.getFavoriteNumber() < u2.getFavoriteNumber()) {
                    return +1;
                } else {
                    return 0;
                }
            }

        };

        // lambda expression
        Comparator<User> userComparer = (u1, u2) -> {
            if (u1.getFavoriteNumber() > u2.getFavoriteNumber()) {
                return -1;
            } else if (u1.getFavoriteNumber() < u2.getFavoriteNumber()) {
                return +1;
            } else {
                return 0;
            }
        };

        // CargoHolder h = new CargoHolder() {

        // @Override
        // public void load() {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'load'");
        // }

        // @Override
        // public void remove() {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'remove'");
        // }

        // };

        Collections.sort(users, userComparer);

        System.out.println(users);



        Commuter studentWhoDrives = () -> {
            System.out.println("drives to WSU in the snow");
        };



        studentWhoDrives.commute();


    }
}