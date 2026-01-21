public class Car extends Vehicle {

    public Car(String color){
        // best practice 
        super(color);
    }
    

    @Override
    public void drive() {

        System.out.println("....vrom...");
    }
}
