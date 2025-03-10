import java.util.Scanner;

class MovieTicket {
    // Attributes
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false; // usually seat is not booked at first
    }

    // Method to book a ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.printf("Ticket for \"%s\" (Seat No: %d) has been successfully booked for $%.2f%n", movieName, seatNumber, price);
        } else {
            System.out.println("Sorry, this seat is already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("\nTicket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for ticket booking
        System.out.print("Type movie name: ");
        String movie = sc.nextLine();

        System.out.print("Enter seat No: ");
        int seat = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        // Creating a MovieTicket object
        MovieTicket ticket = new MovieTicket(movie, seat, ticketPrice);

        // Displaying ticket details before booking
        ticket.displayTicketDetails();

        // Booking the ticket
        System.out.println("\nBooking ticket...");
        ticket.bookTicket();

        // Displaying ticket details after booking
        ticket.displayTicketDetails();

        sc.close();
    }
}
