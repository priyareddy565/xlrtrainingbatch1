package Core_Java;

public class Demo03 {
    public static void main(String[] args){
        int a = 30;
        int b = 40;
        int c = 35;
        if((a>b) && (b>c)){
            System.out.println("a is greater");
        }
        else if((b>a)&&(b>c)){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater ");
        }
    }
    
}
