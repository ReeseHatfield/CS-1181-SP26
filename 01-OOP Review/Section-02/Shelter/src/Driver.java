import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        
        Dog dog = new Dog("Fido");
        FourLeggedThing cat = new Cat("Cleo");
        Bird b1 = new Bird();


        Shelter s = new Shelter();


        if(s instanceof ArrayList){
            System.out.println("true");
        }

        s.board(dog);
        s.board(cat);
        s.board(b1);

        s.simulateNight();

        // System.out.println(s);

    }
}