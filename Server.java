import java.rmi.*;

public class Server {
    public static void main(String[] args) throws Exception{
        try {
            AddI obj=new AddC();
            Naming.rebind("ADD",obj);
            System.out.println("Starting the server for addition");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
