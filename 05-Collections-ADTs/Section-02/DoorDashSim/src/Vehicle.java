public class Vehicle<T extends Commuter> implements Drivable {

    private T driver;

    public Vehicle(T driver){
        this.driver = driver;
    }

    @Override
    public void drive(String car) {

        driver.drive(car);

        System.out.println("You are driving a " + car);
    }

    public void startEngine(){
        System.out.println("Starting engine");
    }
    
}
