package head_first_design_pattern.ch08template;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("물을 끓인다.");
    }

    public void pourInCup() {
        System.out.println("컵에 따른다.");
    }
}
