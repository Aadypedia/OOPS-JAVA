// Program to perform static method using static variable

class Counter {
    // Static variable (shared across all objects)
    static int count = 0;

    // Static method to increment the counter
    static void increment() {
        count++;
        System.out.println("Count is now: " + count);
    }
}

public class static {
    public static void main(String[] args) {
        // Calling static method without creating objects
        Counter.increment();  // Count = 1
        Counter.increment();  // Count = 2
        Counter.increment();  // Count = 3
    }
}