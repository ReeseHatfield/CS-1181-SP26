
public class Bike implements Drivable {

    @Override
    public void drive(String car) {
        System.out.println("Drives in the woods");
    }

    public void replaceChain(){
        System.out.println("replaces bike chain");
    }

}