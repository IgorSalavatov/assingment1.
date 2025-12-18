package assingment1;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item(1, "Laptop", 1200.0);
        Customer customer1 = new Customer(1, "Igor Salavatov", "Igorsalavatov4@gmail.com");

        Order order1 = new Order(101, customer1, item1, 2);
        order1.displayOrder();
    }
}