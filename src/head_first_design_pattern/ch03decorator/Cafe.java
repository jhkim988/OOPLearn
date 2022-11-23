package head_first_design_pattern.ch03decorator;

public class Cafe {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        Beverage beverage2 = new DarkRoast();
        System.out.println(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);
    
        Beverage beverage3 = new HouseBlend();
        System.out.println(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3);
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);
    }
}
