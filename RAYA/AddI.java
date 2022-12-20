import java.rmi.Remote;
import java.rmi.RemoteException;

interface AddI extends Remote{
    public int add(int x,int y) throws RemoteException;
}