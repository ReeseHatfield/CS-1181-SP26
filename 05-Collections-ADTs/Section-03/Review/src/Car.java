public class Car<T extends Item> extends Object implements Drivable {

    private T owner;

    public Car(T owner){
        this.owner = owner;
    }

    @Override
    public void drive(String car) {
        System.out.println("You are driving a car");
    }


    public void popTire(){
        this.owner.getWeight();
    }
    
}
