public class OffByOneBug extends Bug {
    
    public OffByOneBug(String description){
        super(description);
        super.setUrgency(1);
    }

    @Override
    public int compareTo(Bug other) {
        return other.getUrgency().compareTo(this.getUrgency());
    }
}
