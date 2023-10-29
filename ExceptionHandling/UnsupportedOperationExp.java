package ExceptionHandling;

import java.util.*;

class ModifDivision{
	int res;
	public void divide(int n1, int n2) {
		
		try {
			if(n2 == 0) {
				throw new ArithmeticException();
			}
			else {
				int res = n1/n2;
				System.out.println("result="+res);
			}
		}catch(ArithmeticException e) {
			throw new UnsupportedOperationException("the method is unsupported"); 
		}
		
		
	}
	
}


public class UnsupportedOperationExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		ModifDivision div = new ModifDivision();
		div.divide(num1, num2);
		
		sc.close();
	}

}
