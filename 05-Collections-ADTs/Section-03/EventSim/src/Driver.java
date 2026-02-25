import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Driver {

    private static int timeSpentWashingDishes = 0;
    public static void main(String[] args) {
        // discrete event simulation
        // diner

        // find how long it takes to do all the dishes
        // given a certain number of parties
        // tell me about how long it will take to do the dishes

        // parties = 3-5 people
        // dishes take 5-10 seconds to wash

        // Queue<Stack<Dish>> 

        int numParties = 25;
        Queue<Party> parties = new ArrayDeque<>();
        for(int i = 0; i < numParties; i++){
            parties.offer(new Party());
        }

        while(!parties.isEmpty()){
            Party curParty = parties.poll();
            System.out.println("Processing party of " + curParty.getNumPeople());

            Stack<Dish> dishesForCurParty = new Stack<>();
            for(int i = 0; i < curParty.getNumPeople(); i++){

                Random rng = new Random();

                if(rng.nextBoolean()){

                    dishesForCurParty.push(new Dish(rng.nextInt(5, 11)));
                }
                else{
                    dishesForCurParty.push(new Bowl());
                }

            }

            busTable(dishesForCurParty);

        }

        System.err.println("Total time spent was " + timeSpentWashingDishes);

        

        // PQ<Event> = ....
        // offer all TS

        // while(pq is not empty){
        //     Event = pq.poll()

        //     if (event instanceof TS){
        //         offer TaC event back to the PQ
        //         offer this at the correct time
        //     }
        // }
    }

    public static void busTable(Stack<Dish> dishes){

        System.out.println("Spent 3 minutes warming the tap");
        timeSpentWashingDishes += 3;


        while(!dishes.isEmpty()){

            Dish cur = dishes.pop();
            int time = cur.getTimeToClean();

            if(cur instanceof Bowl){
                System.out.println("spent " + time + " cleaning a bowl");

            }else{
                System.out.println("spent " + time + " cleaning a dish");
            }
            
            timeSpentWashingDishes += time;
        }

        System.out.println("Finished cleaning dishes");

    }
}