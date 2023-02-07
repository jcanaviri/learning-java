package mx.com.gm.sales;

public class SalesTest {
    public static void main(String[] args) {
        Product shirt = new Product("T-Shirt", 50.00);
        Product jeans = new Product("Jeans", 100.00);

        Order mySales = new Order();
        mySales.addProduct(shirt);
        mySales.addProduct(jeans);
        System.out.println(mySales);

        Order johnSales = new Order();
        Product shoes = new Product("Black shoes", 99.99);

        johnSales.addProduct(shirt);
        johnSales.addProduct(jeans);
        johnSales.addProduct(shoes);
        System.out.println(johnSales);
    }
}
