import java.util.*;
public class Driver {
    public static void main(String[] args) {

        Shelter thePound = new Shelter();
        thePound.board(new Bird("tweetie"));
        thePound.board(new Dog("fido"));
        thePound.board(new Cat("whiskers1"));
        thePound.board(new Cat("whiskers2"));
        thePound.board(new Cat("whiskers3"));

        thePound.simulateNight();
        
        // Cat c = new Cat("whiskers");

        // Dog d = new Dog("spot");

        // Bird b = new Bird("tweetie");

        // Animal a = new Dog("fido");

        // Escapable e = new Bird("polly");

        // doThing(c);
        // doThing(d);
        // doThing(b);
        


        // Animal a = new Bird("sdf");
    }

    public static void doThing(Animal a){
        a.makeNoise();
    }





}