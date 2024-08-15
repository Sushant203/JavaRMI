import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerRMI  {
public static void main(String[] args) {
	try {
		AddrRemote obj= new AddrRemote();
		
		Registry registry= LocateRegistry.createRegistry(1022);
		System.out.println("server started...");
		
		registry.bind("hello",obj);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
