public class TV extends Product implements Shippable {
    private double weight;

    public TV(String name, double price, int qty, double weight) {
        super(name, price, qty);
        this.weight = weight;
    }
    @Override
    public double weight() {
        return weight;
    }
}
