public class Furniture extends Product {
    private double taxRate = 0.08;

    public Furniture(String name, int stockQuantity, double unitPrice) {
        super(name, stockQuantity, unitPrice);
    }
    @Override
    public double calculateTotalPrice (){
        return unitPrice + (unitPrice*taxRate);
    }

}