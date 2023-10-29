package collectionsFramework;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LocalDate> DoB = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("continue?--yes, no");
			String str = sc.nextLine();
			
			
			if(str.equals("no")) {
				break;
			}
			
			System.out.println("year");
			int year = sc.nextInt();
			System.out.println("month");
			int month = sc.nextInt();
			System.out.println("date");
			int date = sc.nextInt();
			DoB.add(LocalDate.of(year, month, date));
			sc.nextLine();
			
		}
		
		Collections.reverse(DoB);
		
		for(LocalDate data:DoB) {
			if(data.isLeapYear()) {
				System.out.println("Your date of birth is" + data + "and it was a leap year");
			}
			else {
				System.out.println("Your date of birth is" + data + "and it was not a leap year");
			}
		}
		//System.out.println(DoB);
		

	}
	
//	public static void leapYear(LocalDate data) {
//		
//	}

}
