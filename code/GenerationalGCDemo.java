
import java.util.ArrayList;
import java.util.List;

public class GenerationalGCDemo {
    public static void main(String[] args) {

        // Keep long-lived objects reachable
        List<Object> longLived = new ArrayList<>();

        // Create a long-lived object
        longLived.add(new Object());

        // Create short-lived objects
        for (int i = 1; i <= 5; i++) {
            Object shortLived = new Object();

            System.out.println("Created short-lived object " + i);

            // Remove its reference
            shortLived = null;
        }

        System.out.println("Short-lived objects are eligible for GC.");
        System.out.println("Long-lived object is still reachable.");

        // Remove the long-lived reference
        longLived.clear();

        System.out.println("Objects inside the list are eligible for GC.");

        // Remove the reference to the list itself
        longLived = null;

        System.out.println("The list is now eligible for GC.");   
    }
}
