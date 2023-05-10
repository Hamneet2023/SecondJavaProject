package bankOperationUpdatedAssignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BankOperations bank = null;
		PersonDetails Arunjot = new PersonDetails("12346789", "Arunjot", 10000, 1234, "8888y8");
		PersonDetails Sandeep = new PersonDetails("12346780", "Sandeep", 20000, 1334, "5555z");
		PersonDetails Jaspreet = new PersonDetails("12346781", "Jaspreet", 30000, 1244, "fff8");
		PersonDetails Harpreet = new PersonDetails("12346782", "Harpreet", 40000, 1235, "hhhj");
		PersonDetails Manjit = new PersonDetails("12346782", "Manjit", 50000, 1236, "hhhj");
		Scanner sc = new Scanner(System.in);
		System.out.println("Which banking service do you want to use ATM or online banking:");
		String bankingService = sc.nextLine();
		switch (bankingService) {
		case "ATM":
			bank = new ATM();
			bank.changePinPassword(Arunjot);
			break;
		case "Online Banking":
			bank = new OnlineBanking();
			bank.changePinPassword(Manjit);
			break;
		  default:
		  System.out.println("You can perform your operation only using these two ways: ATM/OnlineBanking");
		  break;
		}

		System.out.println("Please enter which operation you want to perform (Withdraw/Deposit/View Balance)");
		String operation = sc.nextLine();
		switch (operation) {
		case "Withdraw":
			System.out.println("Enter the amount to be withdrawn");
			double withdrawAmount = sc.nextDouble();
			bank.withdrawMoney(Arunjot, withdrawAmount);
			break;
		case "Deposit":
			System.out.println("Enter the depositMoney");
			double depositAmount = sc.nextDouble();
			bank.depositMoney(Arunjot, depositAmount);
			break;
		case "View Balance":
			bank.viewBalance(Manjit);
			break;
		default:
			System.out.println("Enter a valid operation:");
			break;
		}
		System.out.println("Balance in your account is:"+Arunjot.getBalance());

	}

}
