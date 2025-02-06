public class Demo068 {
    public static void main(String[] args) {
            // Example array
        int[] array = {10, 15, 20, 25, 30, 35, 40, 45, 50};
        int evenCount = 0;            // Loop to count even numbers in the array
        for (int element : array) {
            if (element % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of even numbers in the array: " + evenCount);
    }
}
