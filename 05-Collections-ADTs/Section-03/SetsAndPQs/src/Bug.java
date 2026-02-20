public abstract class Bug implements Comparable<Bug> {
    private String description;
    private Integer urgency = 0;


    public void setUrgency(int urgency){
        this.urgency = urgency;
    }

    public Integer getUrgency(){
        return this.urgency;
    }

    public Bug(String description){
        this.description = description;
    }


    public String toString(){
        return "" + this.urgency + ": " + this.description; 
    }


}
