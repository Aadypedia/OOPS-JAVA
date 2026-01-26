class Student {
    int rollNo;
    String name;
    String studentClass;
    Student(int rollNo, String name, String studentClass) {
        this.rollNo = rollNo;
        this.name = name;
        this.studentClass = studentClass;
    }
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Class: " + studentClass);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "Aaradhya", "10th");
        students[1] = new Student(2, "Rohan", "10th");
        students[2] = new Student(3, "Sneha", "10th");
        System.out.println("Student Details:");
        for (Student s : students) {
            s.display();
        }
    }
}