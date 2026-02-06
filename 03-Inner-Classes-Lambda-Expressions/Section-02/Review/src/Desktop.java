public class Desktop extends Computer{

    public Desktop(double speed) {
        super(speed);
    }

    public Desktop(Desktop other){
        super(other.getSpeed());
    }

    @Override
    public void compute() {
        System.out.println("Computes really fast");
    }


    
}
