import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();


        orderManager.addProduct(new Electronics("Phone", 10, 700.00));
        orderManager.addProduct(new Clothing("Shirt", 20, 30.00));
        orderManager.addProduct(new Furniture("Table", 5, 150.00));
        orderManager.addProduct(new Electronics("Laptop", 5, 1000.00));
        orderManager.addProduct(new Clothing("Trousers", 15, 45.00));
        orderManager.addProduct(new Furniture("Chair", 7, 50.00));


        List<Product> sortedProducts = orderManager.getOrderedProducts();
        System.out.println("Sorted Products:");
        for (Product p : sortedProducts) {
            System.out.println(p.getName() + " - Total Price: " + p.calculateTotalPrice() + " - Stock: " + p.getStockQuantity());
        }
    }
}

