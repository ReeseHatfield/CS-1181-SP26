public class Student extends Object implements Commuter, Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public void driveToCampus() {
        System.out.println("drives to campus");
    }

    @Override
    public void driveHome() {
        System.out.println("drives home");
    }

    @Override
    public String toString(){
        return this.name + ": " + this.gpa;
    }




    @Override
    public int compareTo(Student other){
        if(this.gpa > other.gpa){
            return -1;
        }
        else if(this.gpa < other.gpa){
            return +1;
        }
        else{
            return this.name.compareTo(other.name);
        }
    }
}
