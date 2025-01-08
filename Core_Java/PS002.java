package Core_Java;
class NextMultipleOf100{
    public static int nextMultipleOf100(int n) {
       int multiple = (n / 100) + 1;
       return multiple * 100;    
    }
}
public class PS002 {
    public static void main(String[] args) {
        NextMultipleOf100 obj = new NextMultipleOf100();
        int nextMultiple=obj.nextMultipleOf100(299);
        System.out.println("Next multiple of 299 is "+nextMultiple);
    }
}
