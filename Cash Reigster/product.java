public class Product {

    protected String name;
    protected int plu;
    protected double price;
    protected String type;
    protected int quantity;
    protected boolean tax;

    Product(String newName, int newPLU, double newPrice, String newType, int newQuantity, boolean newTax) {
        name = newName;
        plu = newPLU;
        price = newPrice;
        type = newType;
        quantity = newQuantity;
        tax = newTax;
    }
}
