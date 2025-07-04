import java.util.Date;

public class Cheese extends Product implements Expirable , Shippable {
    private double weight;
    private Date expirDate;
    public Cheese(String name,double price ,int qty,Date expirDate,double weight)
    {
        super(name,price,qty);
        this.weight = weight;
        this.expirDate = expirDate;
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
