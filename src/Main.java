import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String formatWeight(double weightInKg) {
        if (weightInKg < 1.0) {
            return String.format("%.0f", weightInKg * 1000) + "g";
        } else {
            return String.format("%.1f", weightInKg) + "kg";
        }
    }

    public static void checkout(Customer customer, Map<Product, Integer> cart) {
        double subtotal = 0;
        double shipping = 0;
        final double shipVees = 5.0;
        double totalWeight = 0;
        boolean shippable = false;
        System.out.println("** Shipment notice **");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            Product product = entry.getKey();
            int qty = entry.getValue();

            if (product instanceof Shippable s) {
                shippable = true;
                String weightGrams = formatWeight(s.weight() * qty);
                System.out.println(qty + "x " + product.getName() + " " + weightGrams);
                totalWeight += s.weight() * qty;
                shipping += s.weight() * qty * shipVees;
            }
        }
        if (shippable) {
            System.out.printf("Total package weight " + formatWeight(totalWeight));
        }
        System.out.println();
        System.out.println("** Checkout receipt **");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            Product product = entry.getKey();
            int qty = entry.getValue();
            double itemTotal = product.getPrice() * qty;
            subtotal += itemTotal;
            if(qty * product.getPrice() > customer.getBalance()) {
                System.out.println("Insufficient balance for: " + product.getName());
                continue;
            }
            customer.purchase(product, qty);
            System.out.println(qty + "x " + product.getName() + " " + itemTotal);
        }
        double total = subtotal + shipping;
        System.out.println("----------------------");
        System.out.println("Subtotal " + subtotal);
        System.out.println("Shipping " + shipping);
        System.out.println("Amount " + total);
    }
    public static void main(String[] args) {
        Product tv = new TV("Samsung TV", 499.99, 10, 15.0);
        Product laptop = new Laptop("Dell Laptop", 899.99, 5, 2.5);
        Product scratchCard = new MobileScratchCards("Mobile Scratch Card", 4.99, 100);
        Product cheese = new Cheese("Cheddar Cheese", 3.99, 20, new java.util.Date(2026, 5, 10), 0.5);
        Product milk = new Milk("Organic Milk", 1.99, 50, new java.util.Date(2025, 12, 31), 1.0);
        Customer customer = new Customer("Hussein Yasser", 2000.00);
        Map<Product, Integer> cart = new HashMap<>();
        cart.put(tv, 1);
        cart.put(laptop, 3);
        cart.put(scratchCard, 2);
        cart.put(cheese, 5);
        cart.put(milk, 10);
        System.out.println("Customer: " + customer.getName());
        checkout(customer, cart);
        System.out.println("Customer balance after purchase: " + customer.getBalance());


    }
}