import java.util.Scanner;

class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check
    public boolean isPalindrome() {
        String trimmed = text.replaceAll("\\s+", "").toLowerCase(); // Removing spaces and converting to lowercase
        int length = trimmed.length();

        String rev = "" + new StringBuilder(trimmed).reverse();
        return (rev.equals(trimmed))?true:false;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string to check for palindrome: ");
        String inputText = sc.nextLine();

        // Creating an object and checking for palindrome
        PalindromeChecker checker = new PalindromeChecker(inputText);
        checker.displayResult();

        sc.close();
    }
}
