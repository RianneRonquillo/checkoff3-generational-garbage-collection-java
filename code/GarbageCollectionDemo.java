public class GarbageCollectionDemo {
    public static void main(String[] args) {
        System.out.println("Starting Garbage Collection Experiment: ");

        Object shortLived = new Object();
        Object longLived = new Object();

        shortLived = null;

        System.out.println("Short-lived object reference removed.");

        longLived = null;

        System.out.println("Long-lived object reference removed.");

    }
}