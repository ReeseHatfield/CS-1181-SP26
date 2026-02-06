public abstract class Computer {
    private double cpuSpeedd;

    public Computer(double speed){
        this.cpuSpeedd = speed;
    }

    public Computer(Computer other){
        this.cpuSpeedd = other.cpuSpeedd;
    }

    public abstract void compute();

    public boolean turnOff(){
        System.out.println("powering down...");
        return true;
    }


    public void setSpeed(double d){
        this.cpuSpeedd = d;
    }

    public String toString(){
        return "" + this.cpuSpeedd;
    }

    public double getSpeed(){
        return this.cpuSpeedd;
    }
}
