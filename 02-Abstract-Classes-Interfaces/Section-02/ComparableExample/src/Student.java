public class Student extends Object implements Comparable<Student>, Commuter {
    private double gpa;
    private String name;

    public Student(String name, double gpa){
        this.gpa = gpa;
        this.name = name;
    }


    public int compareTo(Student other){

        if(this.gpa > other.gpa){
            return -1;
        }
        else if(this.gpa < other.gpa){
            return +1;
        }
        else {
            return this.name.compareTo(other.name);
        }
    }


    @Override
    public String toString(){
        return this.name + ": " + this.gpa; 
    }


    @Override
    public void driveToCampus() {
        System.out.println("drives to campus");
    }


    @Override
    public void driveHome() {
        System.out.println("Drives home");
    }
}
