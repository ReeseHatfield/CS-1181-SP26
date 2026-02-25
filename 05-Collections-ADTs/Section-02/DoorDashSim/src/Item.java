public class Item implements Comparable<Item>{
    private String name;
    private Double weight;

    public Item(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public Item(Item other){
        this.name = other.name;
        this.weight = other.weight;
    }

    @Override
    public int compareTo(Item other) {
        return other.weight.compareTo(this.weight);
    }


    @Override
    public String toString(){
        return this.name + ": " + this.weight;
    }
}
