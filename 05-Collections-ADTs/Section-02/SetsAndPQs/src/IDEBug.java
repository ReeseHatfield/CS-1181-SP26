public class IDEBug extends Bug{

    public IDEBug(String description){
        super(description);

        super.setUrgency(3);

    }

    @Override
    public int compareTo(Bug other) {
        return other.getUrgency().compareTo(this.getUrgency());
    }
    
}
