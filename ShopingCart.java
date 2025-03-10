import java.util.Scanner;

class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost of an item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.printf("%-15s $%.2f  x %d  = $%.2f%n", itemName, price, quantity, getTotalPrice());
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }
}

class ShoppingCart {
    private CartItem[] cart; // Array to store cart items
    private int itemCount; // Tracks number of items in the cart
    private final int MAX_ITEMS = 10; // Maximum items in cart

    // Constructor
    public ShoppingCart() {
        this.cart = new CartItem[MAX_ITEMS];
        this.itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount >= MAX_ITEMS) {
            System.out.println("Cart is full! Cannot add more items.");
            return;
        }

        // Check if item already exists
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].getItemName().equalsIgnoreCase(itemName)) {
                System.out.println("Item already in cart! Try updating quantity.");
                return;
            }
        }

        cart[itemCount++] = new CartItem(itemName, price, quantity);
        System.out.println(itemName + " added to cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].getItemName().equalsIgnoreCase(itemName)) {
                // Shift items left to fill the removed spot
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[itemCount - 1] = null; // Clear last element
                itemCount--;
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    // Method to calculate total cost
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += cart[i].getTotalPrice();
        }
        return total;
    }

    // Method to display all cart items
    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("\nShopping Cart:");
        System.out.println("-------------------------------------");
        for (int i = 0; i < itemCount; i++) {
            cart[i].displayItem();
        }
        System.out.println("-------------------------------------");
        System.out.printf("Total Cost: $%.2f%n", calculateTotal());
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        boolean running = true;

        while (running) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout & Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
                System.out.print("Enter item price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                cart.addItem(itemName, price, quantity);
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String itemName = scanner.nextLine();
                cart.removeItem(itemName);
            } else if (choice == 3) {
                cart.displayCart();
            } else if (choice == 4) {
                cart.displayCart();
                System.out.println("Thank you for shopping!");
                running = false;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
