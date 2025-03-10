class Item{

    private int itemCode;
    private String itemName;
    private double price;

//    constructor
    public Item(int itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

//    display items details
    public void itemDetails(){
        System.out.println("====== Item Details ====== ");
        System.out.println("Item name is " + itemName);
        System.out.println("Item code is " + itemCode);
        System.out.println("Price is " + price);
        System.out.println();
    }

//    method to calculate total cost for a given quantity
    public double totalCost(int quantity){
        return quantity * price;
    }

    public static void main(String[] args) {

//        creating object of class item
        Item item1 = new Item(01, "Surf excel", 10);
        item1.itemDetails();

        int quantity = 3;
        System.out.println("Total cost for item "+ item1.itemName + " with quantity of "+ quantity + " is " + item1.totalCost(quantity));

        Item item2 = new Item(02, "Rin Bar", 20);
        item2.itemDetails();
        System.out.println("Total cost for item "+ item2.itemName + " with quantity of "+ quantity + " is " + item2.totalCost(quantity));


    }

}
