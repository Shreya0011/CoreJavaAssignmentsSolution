package ExceptionHandling;

import java.util.*;

class Division{
	int res; 
	
	public void divide(int n1, int n2) {
		try {
			res = n1/n2;
			System.out.println("the result is="+res);
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by 0" + e);
			e.printStackTrace();
		}
		
	}
}


public class ArithmeticExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Division div = new Division();
		div.divide(num1, num2);
		
		sc.close();
		
		
		

	}

}
