public class Laptop extends Computer {

    public Laptop(double speed) {
        super(speed);
    }

    public Laptop(Laptop other){
        super(other.getSpeed());
    }


    @Override
    public void compute() {
        System.out.println("computes kinda slowly");
    }


    public void closeHinge(){
        System.out.println("closes hinge");
    }
    
}
