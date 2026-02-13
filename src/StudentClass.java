import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        int roll1 = scanner.nextInt();
        scanner.nextLine(); 

        String name2 = scanner.nextLine();
        int roll2 = scanner.nextInt();

        Student student1 = new Student(name1, roll1);
        Student student2 = new Student(name2, roll2);

        student1.display();
        student2.display();
        
        scanner.close();
    }
}
