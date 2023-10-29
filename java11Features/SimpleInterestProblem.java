package java11Features;

import java.util.Scanner;

public class SimpleInterestProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		var amount = sc.nextDouble();
		var rate = sc.nextInt();
		var time = sc.nextInt();
		
		Minimal minimal = (var p, var r, var t)-> (p*r*t)/100;
		System.out.println(minimal.simpleInterest(amount, rate, time));

	}

}

interface Minimal{
	double simpleInterest(double a, int b, int c);
}
