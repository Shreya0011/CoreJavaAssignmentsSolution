package Generics;
import java.util.*;

public class ArrayPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("size of array");
		int size = sc.nextInt();
		
		Integer[] intArr = new Integer[size];
		Double[] doubArr = new Double[size];
		String[] strArr = new String[size];
		
		System.out.println("enter index positions of elements to be exchanged");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		
		System.out.println("enter elements-- \n1.integer array\n 2.double array\n 3.string array");
		int choose = sc.nextInt();
		
		switch(choose) {
		case 1:
			for(int i = 0; i < size; i++) {
				intArr[i] = sc.nextInt();
			}
			exchangePosition(intArr,i1,i2);
			break;
			
		case 2:
			for(int i = 0; i < size; i++) {
				doubArr[i] = sc.nextDouble();
			}
			exchangePosition(doubArr,i1,i2);
			break;
			
		case 3:
			for(int i = 0; i < size; i++) {
				strArr[i] = sc.next();
			}
			exchangePosition(strArr,i1,i2);
			break;
		}
		
		
		
		
		
	}
	
	public static <T> void exchangePosition(T[] arr, int idx1, int idx2) {
		
		T temp;
		
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
