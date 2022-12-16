package head_first_design_pattern.ch11proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
        MyRemote service = new MyRemoteImpl();
        try {
            Naming.rebind("RemoteHello", service);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }
}
