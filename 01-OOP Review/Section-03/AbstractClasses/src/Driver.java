import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {


        // greater in the tree = lower in the tree
        // compile time = run time
        Student s1 = new GradStudent("reese");



        UnderGradStudent s2 = new UnderGradStudent("bibek");
        s2.leadLab();

        GradStudent g1 = new GradStudent("clarissa");

        // g1.driveToCampus();



        // s.goToClass();

        s1.payTuition(400);
        s2.payTuition(500);


        List<String> l = new ArrayList<>(); 


        l.add("asd");


        // Student temp = new Student("reese");


        // attendSchool(s1);
        // attendSchool(s2);
        // attendSchool(s2);


        commute(g1);

        commute(new Faculty());

    }


    // dynamically lookup of the method body at runtime
    // dynamic dispatch
    public static void commute(Commuter c){

        System.out.println();
        c.driveToCampus();
        System.out.println("from commute method");

    }


    // look up at runtime what the right body to call is
    public static void attendSchool(Student s){

        for(int i = 0; i < 5; i++){
            s.goToClass();
        }


    }
}