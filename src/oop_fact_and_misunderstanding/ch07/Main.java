package oop_fact_and_misunderstanding.ch07;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Barista barista = new Barista();
        Customer customer = new Customer();

        menu.addItem("아메리카노", 4000);
        menu.addItem("카페 라떼", 4500);
        menu.addItem("에스프레소", 3800);
        customer.order("아메리카노", menu, barista);
    }
}
