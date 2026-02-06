public class Pair<E1, E2> {
    

    private Box<E1> b1;
    private Box<E2> b2;

    public Pair(E1 elem1, E2 elem2){
        this.b1 = new Box<>(elem1);
        this.b2 = new Box<>(elem2);
    }

    public E1 getElem1(){
        return this.b1.getElement();
    }

    public Box<E2> getB2(){
        return this.b2;
    }


}
