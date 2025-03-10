class Student {

//    class attributes

    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // calculate grade marks
    public String evaluateMarks() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F"; // Fail
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.printf("Marks: %.2f%n", marks);
        System.out.println("Grade: " + evaluateMarks());
    }

    // Main method
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Nikhil", 101, 85.5);
        Student student2 = new Student("Jashan", 102, 99.3);

        // Displaying student details
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
    }
}
