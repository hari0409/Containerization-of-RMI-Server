import java.rmi.*;

public class Server {
    public static void main(String[] args) throws Exception{
        try {
            CalcI obj=new CalcC();
            Naming.rebind("CALC",obj);
            System.out.println("Starting the Calculator server");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
