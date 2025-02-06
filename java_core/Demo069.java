public class Demo069 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int sum =0 ;

        for(int element: array){
            sum +=element;
        }
        System.out.println("Sum of all elements in the array is: "+sum);
    }
}
