package assingment1;


import java.util.Objects;

public class Order {
    private int orderId;
    private Customer customer;
    private Item item;
    private int quantity;

    public Order(int orderId, Customer customer, Item item, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double calculateTotalPrice() {
        return item.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        customer.displayCustomer();
        item.displayItem();
        System.out.println("Quantity: " + quantity + ", Total: $" + calculateTotalPrice());
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", customer=" + customer.getName() +
                ", item=" + item.getName() + ", quantity=" + quantity + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order order = (Order) obj;
        return orderId == order.orderId &&
                quantity == order.quantity &&
                Objects.equals(customer, order.customer) &&
                Objects.equals(item, order.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customer, item, quantity);
    }
}