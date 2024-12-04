public class Order {
    private String itemName;
    private double price;
    private int quantity; // Changed to int
    private String size;

    // Constructor for generic items (Coffee, Tea, etc.)
    public Order(String itemName, double price, int quantity, String size) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }

    // Getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() { // Changed to int
        return quantity;
    }

    public void setQuantity(int quantity) { // Changed to int
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Order [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + ", size=" + size + "]";
    }
}
