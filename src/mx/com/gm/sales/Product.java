package mx.com.gm.sales;

@SuppressWarnings("unused")
public class Product {
    private static int productCounter;
    private final int productId;
    private String name;
    private double price;

    private Product() {
        this.productId = ++Product.productCounter;
    }

    public Product(String name, double price) {
        this();  // Call to the empty constructor
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
