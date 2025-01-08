package Core_Java;
class triangleAreaDemo{
    void Area(){
        int base = 5;
        int height = 10;
        double ta = 0.5 * base * height;
        System.out.println("The area of triangle: "+ta);
    }
}
public class Demo013 {
    public static void main(String[] args) {
        triangleAreaDemo t = new triangleAreaDemo();
        t.Area();
    }
}
