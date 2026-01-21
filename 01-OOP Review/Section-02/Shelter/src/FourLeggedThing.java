public abstract class FourLeggedThing implements Escapable {
    
    private String name;

    public FourLeggedThing(String name){
        this.name = name;
    }

    public void sitQuietly(){
        System.out.println(this.name + " sits quietly...");
    }


    public void escape(){
        
    }

    public abstract void makeNoise();

}
