package head_first_design_pattern.ch10state;

public class WinnerState implements State {
    private final GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("당첨 알맹이를 내보내고 있습니다.");        
    }

    @Override
    public void ejectQuarter() {
        System.out.println("당첨 알맹이를 내보내고 있습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("당첨 알맹이를 내보내고 있습니다.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("더 이상 알맹이가 없습니다.");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill(int num) {
        System.out.println("매진된 상태에서만 리필합니다.");         
    }
}
