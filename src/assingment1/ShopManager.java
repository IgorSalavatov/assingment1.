package assingment1;

import java.util.*;

public class ShopManager {
    private List<Customer> customers = new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public void addCustomer(Customer c) { customers.add(c); }
    public void addItem(Item i) { items.add(i); }
    public void addOrder(Order o) { orders.add(o); }

    public Customer findCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public Item findItemByName(String name) {
        for (Item i : items) {
            if (i.getName().equalsIgnoreCase(name)) return i;
        }
        return null;
    }

    public List<Item> filterByMinPrice(double minPrice) {
        List<Item> result = new ArrayList<>();
        for (Item i : items) {
            if (i.getPrice() >= minPrice) result.add(i);
        }
        return result;
    }


    public List<Item> sortItemsByPrice() {
        List<Item> sorted = new ArrayList<>(items);
        sorted.sort(Comparator.comparingDouble(Item::getPrice));
        return sorted;
    }

    public List<Order> sortOrdersByTotal() {
        List<Order> sorted = new ArrayList<>(orders);
        sorted.sort((o1, o2) -> Double.compare(o2.calculateTotalPrice(), o1.calculateTotalPrice()));
        return sorted;
    }


    public void showAll() {
        System.out.println("\n=== CUSTOMERS ===");
        for (Customer c : customers) c.displayCustomer();

        System.out.println("\n=== ITEMS ===");
        for (Item i : items) i.displayItem();

        System.out.println("\n=== ORDERS ===");
        for (Order o : orders) o.displayOrder();
    }
}