package head_first_design_pattern.ch11proxy.gumball;

import java.io.*;

public interface State extends Serializable {
    public void insertQuearter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
