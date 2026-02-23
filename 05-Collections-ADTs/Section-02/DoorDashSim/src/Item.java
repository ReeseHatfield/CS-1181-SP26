public class Item {
    private String name;
    private double weight;

    public Item(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public Item(Item other){
        this.name = other.name;
        this.weight = other.weight;
    }
}
