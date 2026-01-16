import java.util.*;

public class Shelter extends ArrayList<Animal>{
    
    public void board(Animal animalToBoard){

        this.add(animalToBoard);
    }


    public void simulateNight(){
        for(Animal curAnimal: this){

            // instanceOf
            // if(curAnimal instanceof Bird){
                
            //     Bird b = (Bird) curAnimal; 
            //     b.escape();

            //     System.out.println("im a bird!");
            // }
            // else if(curAnimal instanceof Cat){
            //     System.out.println("im a cat");
            // }

            if(curAnimal instanceof Escapable){
                Escapable e = (Escapable) curAnimal;
                e.escape();
            }

            System.out.println(curAnimal);
            curAnimal.makeNoise();
            System.out.println();
        }
    }


}
