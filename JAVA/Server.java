import java.rmi.*;

public class Server {
    public static void main(String[] args) throws Exception{
        try {
            CalcI obj=new CalcC();
            Naming.rebind("//172.17.0.2/CALC",obj);
            System.out.println("Starting the Calculator server");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
