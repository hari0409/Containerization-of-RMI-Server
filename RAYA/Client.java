import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        AddI obj=(AddI)Naming.lookup("RIYA");
        System.out.println(obj.add(x, y));
        
    }
}
