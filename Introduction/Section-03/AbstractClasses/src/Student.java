public abstract class Student {
    
    private int tuitionLeft = 1000;

    protected String name;

    public Student(String name){
        this.name = name;
    }

    // declaration of the method
    public abstract void goToClass();


    public String getName(){
        return this.name;
    }


    public boolean payTuition(int amountToPay){
        if(amountToPay < 100){
            System.out.println("Insiffucient money");
            return false;
        }

        this.tuitionLeft -= amountToPay;
        System.out.println("You paid " + amountToPay);
        return true;

    }

}
