import java.rmi.*;

public class Server {
    public static void main(String[] args) throws Exception{
        try {
        AddI obj=new AddC();
        Naming.rebind("RIYA", obj);
        System.out.println("Server online");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
