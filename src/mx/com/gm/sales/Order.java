package mx.com.gm.sales;

import java.util.Arrays;

public class Order {
    private final int orderId;
    private Product[] products;
    private static int orderCounter;
    private int productCounter;
    private static final int MAX_PRODUCTS = 10;

    public Order() {
        this.orderId = ++Order.orderCounter;
        this.products = new Product[MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.productCounter < Order.MAX_PRODUCTS)
            this.products[productCounter++] = product;
        else
            System.out.println("Overload MAX_PRODUCTS " + Order.MAX_PRODUCTS);
    }

    public double getTotal() {
        return Arrays.stream(this.products, 0, this.productCounter)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order {");
        sb.append("\n\torderId = ").append(orderId);
        sb.append("\n\t, total order = ").append(this.getTotal());
        sb.append("\n\t, products = ").append(Arrays.toString(products));
        sb.append("\n\t, productCounter = ").append(productCounter);
        sb.append("\n}");
        return sb.toString();
    }
}
