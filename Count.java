class Counter {
    static int count = 0;  
    Counter() {
        count++;  
        System.out.println("Value is " + count);
    }
}
public class Count {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();                                                     
        Counter c3 = new Counter();

        System.out.println("Final Count" + Counter.count);
    }
}                                                                          
