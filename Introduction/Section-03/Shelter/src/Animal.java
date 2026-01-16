public abstract class Animal {

    private String name;

    // public Animal(){}

    public Animal(String name){
        this.name = name;
    }
    
    public void sitQuiet(){
        System.out.println(this.name + " sits quietly");
    }

    public abstract void makeNoise();
}
