import java.rmi.*;

public interface AddI extends Remote{
    public int add(int x,int y) throws RemoteException;   
}
 