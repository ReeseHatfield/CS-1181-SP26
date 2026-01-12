public class Driver {
    public static void main(String[] args) {
        // System.out.println("test");


        // Dog d1 = new Dog("Grover");
        // Dog d2 = new Dog("Charles");


        driveDistance(10, new Car());

        driveDistance(16, new Truck());



    }


    public static void driveDistance(int miles, Vehicle v){

        for(int i = 0; i < miles; i++) {
            v.drive();
        }
    }
}