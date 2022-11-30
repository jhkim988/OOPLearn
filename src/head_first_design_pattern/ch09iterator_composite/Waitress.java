package head_first_design_pattern.ch09iterator_composite;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHousemenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHousemenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iter) {
        while (iter.hasNext()) {
            MenuItem item = iter.next();
            System.out.println(item.getName() + ", " + item.getPrice() + "--" + item.getDescription()); 
        }
    }
}
