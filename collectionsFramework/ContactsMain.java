package collectionsFramework;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

import collectionsFramework.Contacts.Gender;

public class ContactsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Long, Contacts> map = new TreeMap<>();
		
		while(true) {
			System.out.println("continue? ---yes, no");
			String choice = sc.nextLine();
			
			if(choice.equals("no")) {
				break;
			}
			
			System.out.println("phoneNo");
			Long phoneNo = sc.nextLong();
			sc.nextLine();
			System.out.println("Name");
			String name = sc.nextLine();
			System.out.println("email");
			String email = sc.nextLine();
			System.out.println("gender");
			String str = sc.nextLine();
			Gender gender = null;
			
			switch(str) {
			case "Male":
				 gender = Gender.Male;
				break;
			case "Female":
				 gender = Gender.Female;
				break;
			default:
				break;
			}
			
			map.put(phoneNo, new Contacts(name, email, gender));
			
			}
		
		
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		Collections.reverseOrder();
		for(Long key:map.keySet()) {
			System.out.println(key + " : "+ map.get(key));
		}

	}

}
