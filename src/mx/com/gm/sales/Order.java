package mx.com.gm.sales;

import java.util.Arrays;

public class Order {
    private static final int MAX_PRODUCTS = 5;
    private static int orderCounter;
    private final int orderId;
    private final Product[] products;
    private int productCounter;

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
        String sb = "Order {" + "\n\torderId = " + orderId +
                "\n\t, total order = " + this.getTotal() +
                "\n\t, products = " + Arrays.toString(products) +
                "\n\t, productCounter = " + productCounter +
                "\n}";
        return sb;
    }
}
