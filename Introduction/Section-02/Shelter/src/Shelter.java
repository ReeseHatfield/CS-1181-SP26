import java.util.ArrayList;

public class Shelter extends ArrayList<Escapable>{
    
    public void board(Escapable e){
        super.add(e);
    }


    public void simulateNight(){
        for(Escapable e: this){
            System.out.println(e);

            // if there was a way to check the underlying

            // instanceof

            if(e instanceof Dog){

                // e is a DOG
                // class casting

                ((Dog) e).makeNoise();

                // BACS
                System.out.println("I was a dog");
            }
            else if(e instanceof Cat){
                System.out.println("I was a cat");

                Cat c = (Cat) e;
                c.makeNoise();
            }
            else if(e instanceof Bird){


                System.out.println("I was a bird");
            }
        }
    }
}
