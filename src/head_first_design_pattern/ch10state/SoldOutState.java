package head_first_design_pattern.ch10state;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이가 모두 소진됐습니다.");        
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣지 않았습니다. 반환할 수 없습니다.");        
    }

    @Override
    public void turnCrank() {
        System.out.println("매진 됐습니다.");        
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }
    
    @Override
    public void refill(int num) {
        gumballMachine.setCount(gumballMachine.getCount() + num);
        System.out.println("리필합니다. 남은 개수: " + gumballMachine.getCount());         
    }
}
