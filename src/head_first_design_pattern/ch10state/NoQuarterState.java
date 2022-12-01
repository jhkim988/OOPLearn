package head_first_design_pattern.ch10state;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣었습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());        
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요");        
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void refill(int num) {
        System.out.println("매진된 상태에서만 리필합니다.");        
    }
}
