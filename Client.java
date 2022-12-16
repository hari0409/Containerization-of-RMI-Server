import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception{
        try {
            AddI obj=(AddI)Naming.lookup("ADD");
            int res=obj.add(5,4);
            System.out.println(res);    
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
