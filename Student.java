import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void displayStudentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Grades: " + grades);
        System.out.printf("Average: %.2f%n", calculateAverage());
        System.out.println();
    }

    public String getName() {
        return name;
    }
}

class GradeManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.displayStudentDetails();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student charlie = new Student("Charlie");

        manager.addStudent(alice);
        manager.addStudent(bob);
        manager.addStudent(charlie);

        alice.addGrade(85.5);
        alice.addGrade(90.0);
        bob.addGrade(70.0);
        bob.addGrade(75.5);
        charlie.addGrade(88.0);

        System.out.println("All Students:");
        manager.displayAllStudents();

        String searchName = "Bob";
        System.out.println("Looking up: " + searchName);
        Student found = manager.findStudentByName(searchName);
        if (found != null) {
            found.displayStudentDetails();
        } else {
            System.out.println("No match found.");
        }
    }
}