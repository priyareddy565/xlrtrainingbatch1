import java.util.Scanner;
class NextMultipleOf100 {
    
    public int getNextMultipleOf100(int num) {
             if (num <= 0)
                 return -1;
             return ((num / 100) + 1) * 100;
        }
    }
    
    public class PS002 {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                NextMultipleOf100 obj = new NextMultipleOf100();
                System.out.println(obj.getNextMultipleOf100(num));
            }
    }

}