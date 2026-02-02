final class Vehicle {
    final int wheels = 4;

    final void displayInfo() {
        System.out.println("This vehicle has " + wheels + " wheels.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        System.out.println("Number of wheels: " + car.wheels);
        car.displayInfo();
    }
}