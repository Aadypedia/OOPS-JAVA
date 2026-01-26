// Program to store name and roll no using static

class Student {
    // Static variables (shared across all objects)
    static int rollNo;
    static String name;

    // Static method to set values
    static void setData(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Static method to display values
    static void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // First student
        Student.setData(1, "Aaradhya");
        Student.display();

        // Second student (overwrites static values)
        Student.setData(2, "Rohan");
        Student.display();

        // Third student
        Student.setData(3, "Sneha");
        Student.display();
    }
}
