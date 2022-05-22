/*
Program: Account.java          Last Date of this Revision: May 19, 2022
Purpose: An application that creates an account and uses a change address
method.
School: CHHS
Course: Computer Science 30
 
*/


//Adds class to package
package Bank;


import java.text.NumberFormat;

public class Account 

{
	private double balance;
	private Customer cust;
	private String acctID;
	
		
	
	/**
	 * constructor
	 * pre: none
	 * post: An account has been created. Balance and 
	 * customer data has been initialized with parameters.
	 */
	
	//Account class that includes balance, first and last name, and address of user
	public Account(double bal, String fName, String lName, String street, String city, String province, String zip)
	 {
		balance = bal;
		
		//constructor method
		cust = new Customer(fName, lName, street, city, province, zip);
		acctID = fName.substring(0,1) + lName;
	}
	

	/**
	 * constructor
	 * pre: none
	 * post: An empty account has been created with the specified account ID.
	 */
	public Account(String ID) {
		balance = 0;
		cust = new Customer("", "", "", "", "", "");
		acctID = ID;
	}


	/** 
	 * Returns the account ID.
	 * pre: none
	 * post: The account ID has been returned.
	 */
	public String getID() {
	 	return(acctID);
	}


	/** 
	 * Returns the current balance.
	 * pre: none
	 * post: The account balance has been returned.
	 */
	public double getBalance() {
	 	return(balance);
	}


	/** 
	 * A deposit is made to the account.
	 * pre: none
	 * post: The balance has been increased by the amount of the deposit.
	 */
	public void deposit(double amt) {
	 	balance += amt;
	}

	
	/** 
	 * A withdrawal is made from the account if there is enough money.
	 * pre: none
	 * post: The balance has been decreased by the amount withdrawn.
	 */
	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}



	//method to change the address of the user
	public void changeAddress(String street, String city, String province, String zip) 
	{
		//change the street of user to the street parameter passed in
		cust.changeStreet(street);
		
		//change the city of user to the city parameter passed in
		cust.changeCity(city);
		
		//change the province of user to the province parameter passed in
		cust.changeProvince(province);
		
		//change the zip of the user to the zip parameter passed in
		cust.changePostalCode(zip);
	}





	
	
	/** 
	 * Returns a true when objects have matching account ids.
	 * pre: none 
	 * post: true has been returned when the objects are equal,
	 * false returned otherwise.
	 */
	public boolean equals(Object acct) {
		Account testAcct = (Account)acct;
		if (acctID.equals(testAcct.acctID)) {
				return(true);
			} else {
				return(false);
			}
	}


	/** 
	 * Returns a String that represents the Account object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = acctID + "\n";
		accountString += cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);
	}
}
	
	


