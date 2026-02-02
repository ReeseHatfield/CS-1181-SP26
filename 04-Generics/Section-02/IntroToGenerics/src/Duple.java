// duple = box but with two things

public class Duple<E1, E2> {
    
    private Box<E1> box1;
    private Box<E2> box2;

    public Duple(E1 elem1, E2 elem2){

        this.box1 = new Box<>(elem1);
        this.box2 = new Box<>(elem2);

    }

    public E1 getElem1(){
        return this.box1.getElem();
    }

    public E2 getElem2(){
        return this.box2.getElem();
    }
}
