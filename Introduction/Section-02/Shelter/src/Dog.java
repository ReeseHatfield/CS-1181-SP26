public class Dog extends FourLeggedThing {

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("bark!");
    }

    @Override
    public void escape() {
        System.out.println("Bite the attendant, runs out front door");
    }
    
}
