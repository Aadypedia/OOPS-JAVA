]public class Wrapper {
    public static void main(String[] args) {
        int x = 5;  // primitive value
        Integer wrappedX = Integer.valueOf(x);  // wrapping
        int unwrappedX = wrappedX.intValue();   // unwrapping

        System.out.println("Wrapped: " + wrappedX + ", Original: " + unwrappedX);
    }
}
