package JAVA;
import java.rmi.RemoteException;
import java.rmi.server.*;

public class CalcC extends UnicastRemoteObject implements CalcI{
    public CalcC() throws RemoteException{
        super();
    }
    public double add(int x,int y)
    {
        return (double)x+y;
    }
    public double sub(int x,int y)
    {
        return (double)x-y;
    }
    public double mul(int x,int y)
    {
        return (double)x*y;
    }
    public double div(int x,int y)
    {
        return (double)x/y;
    }
}
