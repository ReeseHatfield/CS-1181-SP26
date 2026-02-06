public class Student extends Person implements Comumuter{

    @Override
    public void commute() {
        System.out.println("Drive to school");
    }


    public void goToClass(){
        System.out.println("goes to class");
    }
    
}
