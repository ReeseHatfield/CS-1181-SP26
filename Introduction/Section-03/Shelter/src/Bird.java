public class Bird extends Animal implements Escapable {
    
    public Bird(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("sing!");
    }

    @Override
    public void escape() {

        System.out.println("flys away");
    }

}
