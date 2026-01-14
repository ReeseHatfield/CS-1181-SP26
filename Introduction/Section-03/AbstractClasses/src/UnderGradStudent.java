public class UnderGradStudent extends Student{

    public UnderGradStudent(String name){
        super(name);
    }


    @Override
    public void goToClass(){
        System.out.println("Attends CS-1181");
    }


    public void leadLab(){
        System.out.println(super.getName() + " leads a lab");
    }
} 
