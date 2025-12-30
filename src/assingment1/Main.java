package assingment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopManager manager = new ShopManager();


        Customer c1 = new Customer(1, "Igor Salavatov", "Igorsalavatov4@gmail.com");
        Customer c2 = new Customer(2, "Anna Smith", "anna@example.com");

        Item i1 = new Item(1, "Laptop", 1200.0);
        Item i2 = new Item(2, "Mouse", 25.5);
        Item i3 = new Item(3, "Keyboard", 45.0);

        Order o1 = new Order(101, c1, i1, 2);
        Order o2 = new Order(102, c2, i2, 3);

        manager.addCustomer(c1);
        manager.addCustomer(c2);
        manager.addItem(i1);
        manager.addItem(i2);
        manager.addItem(i3);
        manager.addOrder(o1);
        manager.addOrder(o2);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Show all");
            System.out.println("2. Filter items by price");
            System.out.println("3. Find customer");
            System.out.println("4. Sort items by price");
            System.out.println("5. Test equals/hashCode");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.showAll();
                    break;
                case 2:
                    System.out.print("Min price: ");
                    double min = scanner.nextDouble();
                    System.out.println("Items above $" + min + ":");
                    for (Item i : manager.filterByMinPrice(min)) {
                        i.displayItem();
                    }
                    break;
                case 3:
                    System.out.print("Customer ID: ");
                    int id = scanner.nextInt();
                    Customer found = manager.findCustomerById(id);
                    if (found != null) found.displayCustomer();
                    else System.out.println("Not found!");
                    break;
                case 4:
                    System.out.println("Sorted items:");
                    for (Item i : manager.sortItemsByPrice()) {
                        System.out.println(i.getName() + " - $" + i.getPrice());
                    }
                    break;
                case 5:
                    // Тест equals и hashCode
                    Customer test1 = new Customer(100, "Test", "test@test.com");
                    Customer test2 = new Customer(100, "Test", "test@test.com");
                    System.out.println("test1.equals(test2): " + test1.equals(test2));
                    System.out.println("Hash codes: " + test1.hashCode() + " / " + test2.hashCode());
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}