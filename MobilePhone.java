//class name
class MobilePhone{

//    class attributes
    private String brand;
    private String model;
    private double price;

    MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

//    method to display details of the mobile
    public void displayDetails(){
        System.out.println("===== Mobile Details is =====");
        System.out.println("Mobile brand is " + brand);
        System.out.println("Mobile model is " + model);
        System.out.println("Price of that model is " + price);
        System.out.println();
    }

    public static void main(String[] args) {

//        creating mobilephones objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 799.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 999.99);

        // Displaying phone details
        phone1.displayDetails();
        System.out.println(); // Adding space for readability
        phone2.displayDetails();
    }
}
