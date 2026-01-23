public class Car implements Drivable{

    @Override
    public void start() {

        System.out.println("Starting car!!");
    }


    public void changeTire(int numberOfTiresToChange){
        System.out.println("car changes " + numberOfTiresToChange + " tires");
    }
    
}
