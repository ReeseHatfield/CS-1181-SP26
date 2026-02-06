public class Pair<T1, T2> {
    private Box<T1> box1;
    private Box<T2> box2;


    public Pair(T1 thing1, T2 thing2){
        this.box1 = new Box<>(thing1);
        this.box2 = new Box<>(thing2);
    }


    public T1 unBox1(){
        return box1.getThing();
    }

    public T2 unBox2(){
        return box2.getThing();
    }
}
