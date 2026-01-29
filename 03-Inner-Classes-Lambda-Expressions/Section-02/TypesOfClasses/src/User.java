
// outer class
public class User implements Comparable<User>{

    private String name;
    private int id; 

    private Double favoriteNumber;

    public User(String name, int id, Double favNumber){
        this.name = name;
        this.id = id;
        this.favoriteNumber = favNumber;
    }

    public int getId() {
        return id;
    }

    public Double getFavoriteNumber(){
        return this.favoriteNumber;
    }



    @Override
    public String toString() {
        return "Name: " + this.name +
            " ID: " + this.id +
            " Fav Num: " + this.favoriteNumber;
    }


    @Override
    public int compareTo(User other) {
        if(this.id > other.id){
            return -1;
        }
        else if(this.id < other.id){
            return +1;
        }
        else {
            return 0;
        }

    }
}