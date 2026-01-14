public abstract class Vehicle {
    


    private String color;

    public Vehicle(String color){
        this.color = color;
    }

    // declaration -> implement



    // declared that method
    // described behavior
    public abstract void drive();

    public void start(String keyring){
        System.out.println("Starting vehicle with keyring: " + keyring);

        System.out.println("...");
        System.out.println("Vehicle started");
    }


    public String getColor(){
        return this.color;
    }

}
