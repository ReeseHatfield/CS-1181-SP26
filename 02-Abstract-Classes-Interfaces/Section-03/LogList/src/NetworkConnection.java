public class NetworkConnection implements Connection {

    @Override
    public boolean connect() {
        System.out.println("connecting to network");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("disconnecting from network");
        return true;
    }

    public String visitWebsite(String url){
        return "here is the sites content: ....";
    }
    
}
