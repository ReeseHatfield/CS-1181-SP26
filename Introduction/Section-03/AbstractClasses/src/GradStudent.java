public class GradStudent extends Student implements Commuter {
    
    public GradStudent(String name){
        super(name);
    }

    // implementation of method
    @Override
    public void goToClass(){

        // everytime we attend, were gonna pay 150
        super.payTuition(150);


        System.out.println(super.getName()  + " attends CS-7200");
    }

    @Override
    public void driveToCampus() {
        System.out.println(super.getName() + " drives to campus");
    }

}
