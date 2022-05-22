/*
Program: FindNames.java          Last Date of this Revision: May 18, 2022
Purpose: To create a FindName application that uses the Search class. This
class should prompt the user for names to fill an array and then prompt the 
user for the name to find. 
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Added class to package
package FindName;

import java.util.*;

public class FindNames 

{
		//Main method
		public static void main (String[] args)
		
		{
	
	//Location variable 
    int location;
    
    //FindName variable
	String FindName;
	
	
	//Prompts user for the number of names they would like in the array
	Scanner inp = new Scanner(System.in);
	System.out.println("How many names would you like to have in the array");
	int userInput = inp.nextInt();

	
	
	//New String array called nameArray
	String[] nameArray = new String[userInput];
	
	
	
	
	for (int i = 0; i < userInput; i++)
	{
		//Prompts user to type the names they would like to enter the array with
		System.out.println("Please type in the names you would like for the array");
		nameArray[i] = inp.next();
	}
	
	//Prompt user for the name they would like to find
	System.out.println("What name would you like to find?");
	FindName = inp.next();
	
	
	//Calls on the Search method to see if the name the user inputted is in the array
	location = Search.linear(nameArray, FindName);
	if (location == -1)
	{
		//If the name is not in the array, output this message
		System.out.println("Sorry, the name is not in the array");
	}
	
	else 
	{
		//Output where the word is first found
		System.out.println("The first occurence of the word is found at " + location);
	}
	
	inp.close();
	
	}
}
	
	

