import java.util.ArrayList;

public class Driver {
    public static void main(String[] args){
        Child c = new Child();


        // System.out.println(c.getValue());


        //dynamic dispatch
        // java does not know the compile time implementation
        // so it will dynamically look up the implementation


        // startCar(new Drivable());

        Connection db = new DatabaseConnection();
        Connection net = new NetworkConnection();

        connectToThing(db);
        connectToThing(net);


        LogList theLogList = new LogList();

        theLogList.addLog("Event 1");
        theLogList.addLog("Event 2");
        theLogList.addLog("Event 3");
        theLogList.addLog("Event 4");
        theLogList.addLog("Event 5");
        theLogList.addLog("Event 6");

        // ll.clear();

        theLogList.printEveryOther();





    }


    public static void connectToThing(Connection c){
        c.connect();


    }


    public static void startCar(Drivable d){

        d.start();
        // d.changeTire(4);
    }
}