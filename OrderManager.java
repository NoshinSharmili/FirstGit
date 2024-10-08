import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderManager {

    private static List<Product> productList;

    public OrderManager() {
        this.productList = new ArrayList<>();
    }
    public static void addProduct(Product product) {
        productList.add(product);
    }

    public List <Product> getOrderedProducts(){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {

                if (Double.compare(p1.calculateTotalPrice(), p2.calculateTotalPrice()) != 0) {
                    return Double.compare(p1.calculateTotalPrice(), p2.calculateTotalPrice());
                }

                int nameComparison = p1.getName().compareTo(p2.getName());
                if (nameComparison != 0) {
                    return nameComparison;
                }

                return Integer.compare(p1.getStockQuantity(), p2.getStockQuantity());
            }
        });
        return productList;
    }


}

