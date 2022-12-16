# RMI:
 
## For the server:
* Create an INTERFACE extending Remote with the function in a file
* Create a CLASS implementing the above interface with the constructor & the implementation of the function declared in the interface file
* Create a server file with the name bind

Add Interface:  
```
import java.rmi.*;
public interface AddI extends Remote{
    public int add(int x,int y) throws Exception;   
}
```
Add Class:
```
import java.rmi.server.UnicastRemoteObject;
public class AddC extends UnicastRemoteObject implements AddI{
    public AddC() throws Exception{
        super();
    }
    public int add(int x,int y) 
    {
        return x+y;
    }
}
```
Server File
```
import java.rmi.*;

public class Server {
    public static void main(String[] args) throws Exception{
        AddC obj=new AddC();
        Naming.rebind("ADD",obj);
        System.out.println("Starting the server");
    }
}
```

---
## For the client:
* Create a client file with object created calling the remote method  

Client File:
```
import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception{
        AddI obj=(AddI)Naming.lookup("Add");
        int res=obj.add(5,4);
        System.out.println(res);
    }
}
```
---
## Running the application
* Uses the PORT 1099
* In the terminal compile all the java file using the command `javac *.java`
* Create the stub for the CLASS file using the command `rmic CLASS_NAME`
* Start the RMI registry using the command `rmiregistry &` & check the port using `netstat -nlp | grep PORT_NUMBER` 
