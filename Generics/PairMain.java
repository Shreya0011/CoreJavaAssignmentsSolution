package Generics;
import java.util.*;

public class PairMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Pair<String,String> object1 = new Pair<>();
		String key = sc.nextLine();
		object1.setKey(key);
		String value = sc.nextLine();
		object1.setValue(value);
//		System.out.println(object1.getKey());
//		System.out.println(object1.getValue());
		System.out.println(object1.toString());
		
		
		Pair<String, java.util.Date> object2 = new Pair<>();
		String key2 = sc.nextLine();
		object2.setKey(key2);
		object2.setValue(new java.util.Date());
		System.out.println(object2.toString());
		
		
	}

}
