import java.util.*;

public class Driver {

    private static int timeSpentWashingDishes = 0;
    public static void main(String[] args) {
        // discrete event simulation
        // diner
        // find how long it takes to do all the dishes
        // given a certain number of parties
        // tell me about how long it will take to do the dishes

        // parties = 3-5 people
        // party arrives every 10 minutes
        // dishes take 5-10 seconds to wash
        int numParties = 20;

        // initialize all starting events
        Queue<Party> parties = new ArrayDeque<>();
        for(int i = 0; i < numParties; i ++){
            parties.offer(new Party());
        }

        // System.out.println(parties);

        Random rng = new Random();

        while(!parties.isEmpty()){
            Party curParty = parties.poll();

            int numDishes = curParty.getNumPeople();

            Stack<Dish> dishes = new Stack<>();

            for(int i = 0; i < numDishes; i++){
                // make all dishes


                if(rng.nextBoolean()){
                    int dirtyness = rng.nextInt(5, 11);
                    Dish curDish = new Dish(dirtyness);
    
                    dishes.push(curDish);
                }
                else {
                    dishes.push(new Bowl());
                }
            }
            // give it to the busser to take to the dishwasher
            busTable(dishes);

        }

        // while pq.is not empty

        // if (pq.poll instance of TS){
        // pq offer TaC
        // }




        // Stack<Dish> temp = new Stack<>();
        // temp.push(new Dish(5));
        // temp.push(new Dish(2));
        // temp.push(new Dish(9));

        // busTable(temp);

        // System.out.println("End time was: " + timeSpentWashingDishes);

    }

    public static void busTable(Stack<Dish> dishes){
        // let it take 3 minutes for the sink to warm up

        System.out.println("At time=" + timeSpentWashingDishes + ": spent 3 minutes warming up the sink");
        timeSpentWashingDishes += 3;


        while(!dishes.isEmpty()){
            Dish cur = dishes.pop();

            if(cur instanceof Bowl){

                System.out.println("At time=" + timeSpentWashingDishes + ": spent " + cur.timeToClean() + " cleaning a bowl");
                timeSpentWashingDishes += cur.timeToClean();

            } else {

                System.out.println("At time=" + timeSpentWashingDishes + ": spent " + cur.timeToClean() + " cleaning a dish");
                timeSpentWashingDishes += cur.timeToClean();
            }

        }

        System.out.println("At time=" + timeSpentWashingDishes + ": sink cooled down");
    }
}