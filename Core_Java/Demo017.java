package Core_Java;
class SumOF2Digits{
    public static int getSumOf2Digits(int n){
        int a=n/10;
        int b=n%10;
        int sum = a+b;
        return sum;
    }
}
public class Demo017 {
    public static void main(String[] args) {
        int n=50;
        int sum = SumOF2Digits.getSumOf2Digits(n);
        System.out.println("Sum of 2 digits of "+n+" is "+sum);

    }
}
