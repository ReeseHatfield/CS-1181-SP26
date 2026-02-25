public class Item implements Comparable<Item>{
    private String name;
    private Double weight;
    private Integer value;

    public Item(String name, Double weight, int value){
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public Double getWeight(){
        return this.weight;
    }

    public Item(Item other){
        this.name = other.name;
    }

    @Override
    public int compareTo(Item other) {
        return other.value.compareTo(this.value);

    }

    public String toString(){
        return this.name + ": " + weight + " " + value;
    }
}
