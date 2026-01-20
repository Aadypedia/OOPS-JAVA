class Student {
    int id;
    String name;
}

public class main1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.id = 101;

        Student s2 = new Student();
        s2.name = "Bob";
        s2.id = 102;

        System.out.println(s1.id + " Name: " + s1.name);
        System.out.println(s2.id + " Name: " + s2.name);
    }
}
