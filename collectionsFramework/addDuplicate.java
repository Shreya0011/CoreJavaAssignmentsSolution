package collectionsFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import collectionsFramework.Contacts.Gender;

class Product{
	
	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return (name+ ":" + price);
	}
}

public class addDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Set<Product> product = new HashSet<>();
		
		while(true) {
			System.out.println("continue? ---yes, no");
			String choice = sc.nextLine();
			
			if(choice.equals("no")) {
				break;
			}
			System.out.println("Name");
			String name = sc.nextLine();
			System.out.println("price");
			double price = sc.nextDouble();
			sc.nextLine();
			
			
			
			product.add(new Product(name, price));
			
			}
		
		
		for(Object ob:product) {
			System.out.println(ob);
		}

	}

}
