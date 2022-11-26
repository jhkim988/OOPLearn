package head_first_design_pattern.ch08template;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("커피 준비 중...");
        coffeeHook.prepareRecipe();
    }
}
