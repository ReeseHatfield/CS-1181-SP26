public class LogicBug extends Bug {

    public LogicBug(String description){
        super(description);
        super.setUrgency(5);
        
    }

    @Override
    public int compareTo(Bug other) {
        // if(other instanceof OffByOneBug){
        //     // return some value
        // }
        return other.getUrgency().compareTo(this.getUrgency());
    }

    
}
