// first time use
// generic declaration
public class Box<Type> {
    
    private Type element;

    public Box(Type element){
        this.element = element;
    }

    public Type getElement(){
        return this.element;
    }
}
