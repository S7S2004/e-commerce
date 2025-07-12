# E-Commerce System

A Java-based e-commerce system that handles product management, shopping cart operations, and checkout processes. The system supports various types of products including physical and digital items, with features for handling expirable products and shipping calculations.

## Features

- **Product Management**
  - Support for different product types
  - Handling of physical and digital products
  - Expiration date tracking
  - Stock management

- **Shopping Cart**
  - Add multiple products with quantities
  - Automatic cart validation
  - Expiry date checking

- **Checkout System**
  - Detailed receipt generation
  - Shipping weight calculation
  - Subtotal and total amount calculation
  - Customer balance validation
  - Shipping cost calculation based on weight

- **Customer Management**
  - Customer balance tracking
  - Balance validation during checkout

## Product Types

- **Physical Products**
  - TV
  - Laptop
  - Food items (Cheese, Milk)
- **Digital Products**
  - Mobile Scratch Cards

 ## Example Usage 
 ```Java
   Product tv = new TV("Samsung TV", 499.99, 10, 15.0);
        Product laptop = new Laptop("Dell Laptop", 899.99, 5, 2.5);
        Product scratchCard = new MobileScratchCards("Mobile Scratch Card", 4.99, 100);
        Product cheese = new Cheese("Cheddar Cheese", 3.99, 20, new java.util.Date(2026, 5, 10), 0.5);
        Product milk = new Milk("Organic Milk", 1.99, 50, new java.util.Date(125, 5, 31), 1.0);
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
```
 ## Example Output : 
<img width="579" height="621" alt="image" src="https://github.com/user-attachments/assets/c3732c88-b2ae-42f9-9572-64a7632781da" />
