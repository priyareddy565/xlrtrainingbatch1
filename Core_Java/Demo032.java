
import java.util.HashSet;

public class Demo032 {
	public static void main(String[] args){
		HashSetDemo2 hr = new HashSetDemo2();
		hr.HashsetMethod();
	}
}
class HashSetDemo2 {
    void HashsetMethod(){
        HashSet <String>hashSet = new HashSet<String>();
		hashSet.add("INDIA");
		hashSet.add("AUSTRALIA");
		hashSet.add("BANGLADESH");
		hashSet.add("CHINA");
		hashSet.add("DUBAI");
		hashSet.add("SWITZERLAND");
		System.out.println(hashSet);
    }
	
}


