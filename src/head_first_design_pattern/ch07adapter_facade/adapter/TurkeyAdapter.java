package head_first_design_pattern.ch07adapter_facade.adapter;

import java.util.stream.IntStream;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        IntStream.range(0, 5).forEach(x -> turkey.fly());        
    }

}
