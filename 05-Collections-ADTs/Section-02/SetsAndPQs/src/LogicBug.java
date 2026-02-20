public class LogicBug extends Bug {
    

    public LogicBug(String description){
        super(description);
        super.setUrgency(5);
    }

    @Override
    public int compareTo(Bug other) {
        return other.getUrgency().compareTo(this.getUrgency());
    }

}
