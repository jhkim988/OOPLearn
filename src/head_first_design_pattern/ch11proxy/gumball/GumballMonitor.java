package head_first_design_pattern.ch11proxy.gumball;

public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("뽑기 기계 위치: " + machine.getLocation());
        // System.out.println("현재 재고: " + machine.getCount());
        // System.out.println("현재 상태: " + machine.getState());
    }
}
