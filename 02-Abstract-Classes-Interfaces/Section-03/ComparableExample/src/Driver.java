import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        
        
        list.add(new Student("charlie", 4.0));
        list.add(new Student("bob", 2.3));
        list.add(new Student("alan", 4.0));
        list.add(new Student("derek", 1.2));
        list.add(new Student("alice", 3.4));

        Commuter c = new Student("asdf", 0);


        UndergradStudent ug = new UndergradStudent("asdf", 0);
        System.out.println(ug);

        // Student s1 = new Student("alice1", 0);
        // Student s2 = new Student("alice2", 0);

        // s1.compareTo(s2);

        Collections.sort(list);

        System.out.println(list);
    }
}