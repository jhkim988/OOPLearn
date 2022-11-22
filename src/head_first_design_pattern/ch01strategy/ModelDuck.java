package head_first_design_pattern.ch01strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("모형 오리입니다.");        
    }
    
}
