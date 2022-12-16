package head_first_design_pattern.ch11proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// 1. java.rmi.Remote 인터페이스를 구현한다.
// 2. 모든 메서드가 RemoteException 을 던지도록 선언한다.
// 3. 메서드의 리턴타입은 기본형이거나 Serializable 로 한다.
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}