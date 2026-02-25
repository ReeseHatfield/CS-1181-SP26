public class Car<T extends Comparable<T>> extends Object implements Drivable {

    private T owner;

    public Car(T owner){
        this.owner = owner;
    }

    @Override
    public void drive(String car) {
        System.out.println("You are driving a car");
    }


    public void popTire(){
        this.owner.compareTo(owner);
    }
    
}
