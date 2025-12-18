package assingment1;

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

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return item.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        customer.displayCustomer();
        item.displayItem();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
}
