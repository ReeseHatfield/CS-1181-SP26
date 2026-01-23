public class Child extends Parent {

    
    // SOLID
    //S ....
    // O => Open-Closed principle
    // open for extension
    // closed for modification
    @Override
    public String getValue(){
        return super.getValue() + " 2";
    }
}
