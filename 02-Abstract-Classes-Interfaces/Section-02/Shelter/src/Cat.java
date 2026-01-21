public class Cat extends FourLeggedThing {

    public Cat(String name){
        super(name);
    }


    @Override
    public void makeNoise() {
        System.out.println("meow!");
    }


    @Override
    public void escape() {
        System.out.println("slips thru the bars");
    }


    
}
