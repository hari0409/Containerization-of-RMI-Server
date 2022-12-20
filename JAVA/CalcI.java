import java.rmi.*;

public interface CalcI extends Remote{
    public double add(int x,int y) throws RemoteException;
    public double sub(int x,int y) throws RemoteException;    
    public double mul(int x,int y) throws RemoteException;
    public double div(int x,int y) throws RemoteException;
}
 