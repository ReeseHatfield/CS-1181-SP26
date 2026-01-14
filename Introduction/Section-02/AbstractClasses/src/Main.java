public class Main {
    public static void main(String[] args) {
        // System.out.println("test");


        // Dog d1 = new Dog("Grover");
        // Dog d2 = new Dog("Charles");


        // driveDistance(10, new Car());

        driveDistance(16, new Truck());


        // Vehicle v = new Vehicle();

        Truck t = new Truck();
        t.start("My keyring");
        t.drive();


        // v.drive();

        Car c = new Car("Magenta");


        // compile time = run time
        Vehicle hyundai = new Car("Red");


        driveDistance(120, hyundai);


        Truck t2 = new Truck();

        Tugboat tb = new Tugboat();

        doThing(tb);
    }


    public static void driveDistance(int miles, Vehicle v){

        for(int i = 0; i < miles; i++) {
            v.drive();
        }

    }



    // at runtime (not compile)
    // look up the correct method implementation
    // dynamic dispatch
    public static void doThing(CargoHolder ch){

        ch.removeCargo();

    }
}
