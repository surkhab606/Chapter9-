/*
Program: LocalBank.java          Last Date of this Revision: May 19, 2022
Purpose: An application that prompts the user to create/remove an account,
make deposits and withdrawls, check balance and or modify the account
School: CHHS
Course: Computer Science 30
 
*/


//Adds class to package
package Bank;

import java.util.Scanner;

public class LocalBank 

{
	public static void main(String[] args) {
		Bank easySave = new Bank();
		Scanner input = new Scanner(System.in);
		String action, acctID;
		Double amt;

		/* display menu of choices */
		do {
			System.out.println("\nDeposit\\Withdrawal\\Check balance");
			System.out.println("Add an account\\Remove an account");
			System.out.println("Modify an Account");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();

			if (action.equalsIgnoreCase("A")) 
			{
				easySave.addAccount();
			} 
			else if (!action.equalsIgnoreCase("Q")) 
			{
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
				} else if (action.equalsIgnoreCase("W")) {
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);
				} else if (action.equalsIgnoreCase("C")) {
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {
					easySave.deleteAccount(acctID);
				}
								
				//If User wants to Modify the account they Type M
				else if (action.equalsIgnoreCase("M")) {
					easySave.modifyAccount(acctID);
				}
			}
		} while (!action.equalsIgnoreCase("Q"));
	}
}
	
	
