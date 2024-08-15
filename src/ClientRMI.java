import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
	public static void main(String[] args) {
	
		try {
			Registry registry= LocateRegistry.getRegistry("localhost", 1022);
			
			Adder stub=(Adder) registry.lookup("hello");
			
			int result= stub.add(5,10);
			
			System.out.println("result of addition:"+ result);
		} catch (RemoteException e) {
			
			e.printStackTrace();
		} catch (NotBoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
