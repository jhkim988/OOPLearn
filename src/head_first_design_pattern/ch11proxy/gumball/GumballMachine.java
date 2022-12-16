package head_first_design_pattern.ch11proxy.gumball;

public class GumballMachine {
    String location;

    public GumballMachine(String location, int count) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}