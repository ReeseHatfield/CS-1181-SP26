import java.util.*;

public class Driver {
    public static void main(String[] args) {


        
        ArrayList<Student> list = new ArrayList<>();


        list.add(new Student("alice", 2.3));
        list.add(new Student("bob", 3.4));
        list.add(new Student("charlie", 4.0));
        list.add(new Student("alan", 4.0));
        list.add(new Student("derek", 1.2));


        Collections.sort(list);


        Student s1 = new Student("asdf", 0);

        // s1.equals(s1)
        // Student s2 = new Student("qwer", 0);

        // s1.compareTo(s2);




        System.out.println(list);
        
        Commuter c = new Faculty();
        foo(c);

        foo(new Faculty());
        foo(new Student("alice", 2));
    }


    public static void foo(Commuter c){
        c.driveHome();
    }

}
