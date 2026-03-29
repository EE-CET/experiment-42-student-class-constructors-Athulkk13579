import java.util.Scanner;

class StudentClass {
    String name;
    int rollNo;

    // Parameterized Constructor
    StudentClass(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Student 1
        String name1 = sc.nextLine();
        int roll1 = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Input for Student 2
        String name2 = sc.nextLine();
        int roll2 = sc.nextInt();

        // Creating objects using parameterized constructor
        StudentClass s1 = new StudentClass(name1, roll1);
        StudentClass s2 = new StudentClass(name2, roll2);

        // Displaying details
        s1.display();
        s2.display();

        sc.close();
    }
}
