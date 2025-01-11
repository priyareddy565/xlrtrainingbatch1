package psoo3;

import java.util.Scanner;

public class Demo25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String mess=sc.nextLine();
        StringBuilder remess = new StringBuilder(mess);
        remess.reverse();
        System.out.println(remess.toString());
        sc.close();
    }
    
}
