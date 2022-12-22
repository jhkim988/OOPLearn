package head_first_design_pattern.ch11proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    String location;

    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public int getCount() throws RemoteException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public State getState() throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }
}