package bankOperationUpdatedAssignment;

import java.util.Scanner;

public class ATM extends BankOperations {
	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword(PersonDetails account) {
	    int newPin = 0;
	    for (int i = 1; i <= 3; i++) {
	        System.out.print("Enter your old pin: ");
	        int oldPin = sc.nextInt();
	        if (account.getPin() == oldPin) { 
	            System.out.print("Enter your new pin: ");
	            newPin = sc.nextInt();
	            if (newPin != oldPin && String.valueOf(newPin).length() == 4) { // convert int to String to check length
	                System.out.println("Pin changed successfully.");
	                account.setPin(newPin);
	                break;
	            } else {
	                System.out.println("Invalid new pin: must be a 4-digit number and different from the old pin.");
	            }
	        } else {
	            System.out.println("Invalid old pin: please check it.");
	            if (i == 3) {
	                System.out.println("Card blocked."); 
	            }
	        }
	    }
	}

}