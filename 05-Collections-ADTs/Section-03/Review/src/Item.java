public class Item {
    private String name;

    public Item(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    public Item(Item other){
        this.name = other.name;
    }
}
