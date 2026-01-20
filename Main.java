class Student {
    String name;
    int age;
    Student() {
        name = "Aady";
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();  // Capital S
        student1.display();
    }
}
