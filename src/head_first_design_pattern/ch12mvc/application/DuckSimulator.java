package head_first_design_pattern.ch12mvc.application;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose()); // not count!

        Quackologist quackologist = new Quackologist();

        System.out.println("오리 시뮬레이션 게임");
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        for (int i = 0; i < 4; i++) {
            flockOfMallards.add(duckFactory.createMallardDuck());
        }
        flockOfDucks.add(flockOfMallards);
        flockOfDucks.registerObserver(quackologist);
        
        System.out.println("오리 시뮬레이션 게임: 전체 무리");
        simulate(flockOfDucks);

        System.out.println("오리 시뮬레이션 게임: 물오리 무리");
        simulate(flockOfMallards);
        System.out.println(QuackCounter.getQuacks());
    }
    void simulate(Quackable quackable) {
        quackable.quack();
    }
}
