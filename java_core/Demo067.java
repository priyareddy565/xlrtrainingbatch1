public class Demo067 {
    public static void main(String[] args) {
        int[] arr = {22,23,21,4,99};
        System.out.println("Elements at even indices:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}