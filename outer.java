public class Outer {
    class InnerClass {
        void display() {
            System.out.println("Hello from Inner Class!");
        }
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
}
