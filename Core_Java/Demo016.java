package Core_Java;
class PalindromeOF3{
    boolean isPalindrome(int n) {
        return (n/ 100) == (n % 10);
    }
}
public class Demo016 {
    public static void main(String[] args) {
        PalindromeOF3 obj = new PalindromeOF3();
        int n = 131;	
		System.out.println(obj.isPalindrome(n));

    }
}
