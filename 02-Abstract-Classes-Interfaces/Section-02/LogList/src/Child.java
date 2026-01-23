public class Child extends Parent {
    


    // SOLID Princeiples for OOP
    // S ?
    // Open-Closed principle
    // Open for extension
    // Closed for modification
    @Override
    public String getValue(){


        return super.getValue() + " 2";

    }
}
