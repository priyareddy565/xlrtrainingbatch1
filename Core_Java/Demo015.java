package Core_Java;
class swapDemo{
    void swap(){
        int a = 5;
        int b = 10;
        System.out.println("Before swapping a = "+ a +" b = "+ b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a = " + a + " b = " + b);
    }
}
public class Demo015 {
    public static void main(String[] args) {
        swapDemo obj = new swapDemo();
        obj.swap();
    }
}
