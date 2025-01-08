package Core_Java;
class UnaryDemo{
    void UnnaryOP(){
        int a = 10,b=6;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b--);
        System.out.println(--b);
        a=5;
        b=5;
        int c=a++ * --b * a;
        System.out.println(c);
    }
}
public class Demo014 {
    public static void main(String[] args) {
        UnaryDemo obj = new UnaryDemo();
        obj.UnnaryOP();
    }
    
}
