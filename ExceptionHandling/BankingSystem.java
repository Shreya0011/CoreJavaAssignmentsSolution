package ExceptionHandling;

import java.util.*;

class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String msg) {
		System.out.println(msg);
	}
}

class IllegalBankTransactionException extends RuntimeException{
	public IllegalBankTransactionException(String msg) {
		System.out.println(msg);
	}
}

class SavingAccount{
	int id;
	double balance;
	
	public SavingAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(double dep) {
		balance = balance + dep;
		System.out.println("the amount is deposited");
	}
	
	public void withdraw(double withdraw) {
		if((withdraw > balance) ||(balance == 0)) {
			throw new InsufficientBalanceException("balance is insufficient");
		}
		
		else if(withdraw < 0) {
			throw new IllegalBankTransactionException("suspicious banking activity");
		}
		
		else {
			balance = balance - withdraw;
			System.out.println("successful transaction, remaining balance = "+ balance);
		}
	}
	
}

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter balance");
		double balance = sc.nextDouble();
		
		SavingAccount obj = new SavingAccount(id,balance);
		
		System.out.println("choose process\n 1.deposit \n 2.withdraw");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter amount to be deposited");
			double dep = sc.nextDouble();
			obj.deposit(dep);
			break;
		case 2:
			System.out.println("Enter amount to be withdrawn");
			double withdraw = sc.nextDouble();
			obj.withdraw(withdraw);
			break;
		default:
			System.out.println("option not available");
		}
		
		sc.close();
		

	}

}
