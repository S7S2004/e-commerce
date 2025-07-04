public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void purchase(Product product,int quantity,double shippingCostPerKg) {
        if (quantity > product.getQty()) {
            System.out.println("Insufficient quantity for: " + product.getName());
            return;
        }
        double totalCost = product.getPrice() * quantity;
        double shippingCost = 0;

        if (product instanceof Shippable shippable) {
            shippingCost = shippingCostPerKg * shippable.weight() * quantity;
        }
        totalCost += shippingCost;
        if (totalCost <= balance) {
            balance -= totalCost;
            product.qty -= quantity;
        } else {
            System.out.println("Insufficient balance to purchase: " + product.getName());
        }
    }
    public void purchase(Product product, int quantity) {
        purchase(product, quantity, 0);
    }

}
