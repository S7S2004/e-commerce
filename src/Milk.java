import java.util.Date;

public class Milk extends Product implements Expirable, Shippable {
    private Date expirDate;
    private double weight;

    public Milk(String name, double price, int qty, Date expirDate, double weight) {
        super(name, price, qty);
        this.expirDate = expirDate;
        this.weight = weight;
    }

    @Override
    public Date expirDate() {
        return expirDate;
    }

    @Override
    public double weight() {
        return weight;
    }
}
