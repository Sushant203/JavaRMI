import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddrRemote extends UnicastRemoteObject implements Adder {

	protected AddrRemote() throws RemoteException {
		super();
		
	}

	@Override
	public int add(int x, int y) throws RemoteException {
		
		return x+y;
	}

}
