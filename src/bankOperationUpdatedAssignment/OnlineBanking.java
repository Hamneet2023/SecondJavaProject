package bankOperationUpdatedAssignment;
import java.util.Scanner;
public class OnlineBanking extends BankOperations{
	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword(PersonDetails account) {
		String specialCharacters = "([@,&,$])";
		String newPassword = "";
		System.out.print("Enter your old password: ");
		String oldPassword = sc.nextLine();
		if (account.getOnlineBankingPassword().equals(oldPassword)) {
			System.out.print("Enter your new password: ");
			newPassword = sc.next();
			if (!newPassword.equals(oldPassword) && newPassword.length() == 8
					&& !newPassword.contains(specialCharacters)) {
				System.out.println("Password changed successfully.");
				account.setOnlineBankingPassword(newPassword);
			} else {
				if (newPassword.length() != 8) {
					System.out.println("Password must be 8 characters long.");
				}
				if (newPassword.equals(oldPassword)) {
					System.out.println("New password cannot be the same as old password.");
				}
				if (newPassword.contains(specialCharacters)) {
					System.out.println("Special characters @, $, and & are not allowed.");
				}
			}
		} else {
			System.out.println("Incorrect password.");
		}

	}
	
}
