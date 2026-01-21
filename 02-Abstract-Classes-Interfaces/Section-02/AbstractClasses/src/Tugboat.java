public class Tugboat implements CargoHolder {
    

    public void sail(){
        // ...
    }

    @Override
    public boolean loadCargo(int amountToLoad) {

        System.out.println("loading...");
        return true;
    }

    @Override
    public void removeCargo() {
        System.out.println("unloading...");
    }
}
