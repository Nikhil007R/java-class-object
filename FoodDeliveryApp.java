//class definition
public class FoodDeliveryApp {

//    field attributes
    private String name;
    private String location;
    private String[] foodItems;

//    constructor
    public FoodDeliveryApp(String name, String location, String[] foodItems){
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    // Method to display restaurant details
    public void displayDetails() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Location " + location);
        System.out.println("FoodItems: ");

        for (String item : foodItems) {
            System.out.println("_" + item);
        }
    }

    // Method to check if a food item is available
    public boolean isFoodAvailable(String food){
        for(String item: foodItems){
            if(item.equalsIgnoreCase(food)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        String foodItems1[] = {"Pizza", "Pasta", "Burger"};
        String foodItems2[] = {"Sushi", "Ramen", "Tempura"};

        FoodDeliveryApp restaurant1 = new FoodDeliveryApp("Italian Delight", "Downtown", foodItems1);
        FoodDeliveryApp restaurant2 = new FoodDeliveryApp("Tokyo Treats", "Updown", foodItems2);

        System.out.println("===Restaurant1===");
        restaurant1.displayDetails();
        System.out.println("===Restaurant2===");
        restaurant2.displayDetails();

        System.out.println("\n checking food Availability");
        System.out.println("is pasta available in indian delight? " + restaurant1.isFoodAvailable("Pasta"));
        System.out.println("Is Sushi available in Italian Delight? " + restaurant1.isFoodAvailable("Sushi"));
    }
}
