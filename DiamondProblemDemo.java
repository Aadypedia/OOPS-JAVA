interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    @Override
    public void show() {
        System.out.println("Resolved diamond problem using interfaces in Java.");
    }
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}