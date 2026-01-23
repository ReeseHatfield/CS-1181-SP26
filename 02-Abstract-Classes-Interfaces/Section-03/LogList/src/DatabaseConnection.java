public class DatabaseConnection implements Connection {

    @Override
    public boolean connect() {
        System.out.println("connecting to db");
        return true;

    }

    @Override
    public boolean disconnect() {
        System.out.println("you cannot disconnect here");
        return false;
    }
    
}
