public class Laptop  extends Product implements Shippable {
    private double weight;

    public Laptop(String name, double price, int qty, double weight) {
        super(name, price, qty);
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }
}
