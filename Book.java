//class definition
class Book{

//    class attributes
    private String title;
    private String author;
    private int price;

//    class constructor
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

//    method to display bookdetails
    public void bookDetails(){
        System.out.println("===== BookDetails =====");
        System.out.println("The title of the book is " + title);
        System.out.println("The author of the book is " + author);
        System.out.println("The price of the book is " + price);
    }

    public static void main(String[] args) {

//        creating objects of class book
        Book b1 = new Book("THE MONK WHO SOLD HIS FERRARI", "ROBIN SHARMA ", 225);
        Book b2 = new Book("PARADISE LOST", "MILTON, JOHN ", 119);

        b1.bookDetails();
        b2.bookDetails();

    }
}