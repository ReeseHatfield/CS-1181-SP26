// first time use = declaration
public class Box <T> {
    //generics still give us, type safety

    private T elem;

    public Box(T elem){
        this.elem = elem;
    }


    public T getElem(){
        return this.elem;
    }


    public String toString(){
        return "Box containing: " + this.elem.toString();
    }
    
}
