public class Cat extends Animal implements Escapable, Foo {
    

    public Cat(String name){
        super(name);
    }


    @Override
    public void makeNoise() {
        System.out.println("meow!");
    }


    @Override
    public void escape(){
        System.out.println("Sneak thru the bars");
    }
}
