public class Truck extends Vehicle implements CargoHolder {


    private int sizeOfTruckBed;

    public Truck(){
        // all trucks must be blue
        super("Blue");

        this.sizeOfTruckBed = 10;
    }

    // implementation
    @Override
    public void drive(){

        
        System.out.println("VROOOM!");
    }

    @Override
    public boolean loadCargo(int amountToLoad) {

        if(amountToLoad > sizeOfTruckBed) {
            return false;
        }

        System.out.println("loading the cargo...");
        return true;

    }



    @Override
    public void removeCargo(){
        System.out.println("removing cargo....");
    }
}
