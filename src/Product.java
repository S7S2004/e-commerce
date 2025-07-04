public abstract class Product
{
    protected String name;
    protected double price;
    protected int qty;
    public Product(String name, double price, int qty) {
            this.name = name;
            this.price = price;
            this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }


}
