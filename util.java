import java.util.vector;
public class util {
    public static void main(String[] args) {
        Vector<Integer> number = new Vector<>();
        number.add("100");
        number.add("200");
        number.add("300");
        System.out.println("vector:" + number);
        number.remove(1);
        System.out.println("vector after removing element at index 1:" + number);
        System.out.println("size of vector:" + number.size());
        System.out.println("element at index 0:" + number.get(0));
    }
}
