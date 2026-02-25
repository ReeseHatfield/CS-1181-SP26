public class Commuter implements Drivable {
    
    @Override
    public void drive(String car) {
        System.out.println("You are commuting with a " + car);
    }
}

// THe only purpose of this class
// was so I could have a drive() body