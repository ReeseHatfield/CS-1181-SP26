public abstract class Bug implements Comparable<Bug>{
    private Integer urgency = 0;
    private String description;

    public Integer getUrgency() {
        return urgency;
    }

    public void setUrgency(Integer urgency) {
        this.urgency = urgency;
    }


    public Bug(String description){
        this.description = description;
    }

    public String toString(){
        return this.urgency +": " + this.description;
    }

}
