abstract class Product {
    protected String name;
    protected int stockQuantity;
    protected double unitPrice;


    public Product(String name, int stockQuantity, double unitPrice) {
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
    }


    public abstract double calculateTotalPrice();


    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}



