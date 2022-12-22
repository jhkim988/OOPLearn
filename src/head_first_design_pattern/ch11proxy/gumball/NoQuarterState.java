package head_first_design_pattern.ch11proxy.gumball;

import java.rmi.RemoteException;

public class NoQuarterState implements GumballMachineRemote {
    transient GumballMachine gumballMachine; // transient 키워드를 이용하면, 해당 필드를 직렬화하지 않는다. 단, 역직렬화 후 호출하면 안된다.
    
    @Override
    public int getCount() throws RemoteException {
        return 0;
    }

    @Override
    public String getLocation() throws RemoteException {
        return null;
    }

    @Override
    public State getState() throws RemoteException {
        return null;
    }
    
}
