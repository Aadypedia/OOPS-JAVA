class Parent {
    void showMessage() {
        System.out.println("Message from Parent class");
    }
}

class Child extends Parent {
    void showMessage() {
        System.out.println("Message from Child class");
    }

    void display() {
        // Call parent class method using super
        super.showMessage();

        // Call child class method using this
        this.showMessage();
    }
}

public class sup {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
