/*
Program: HighestGrades.java          Last Date of this Revision: May 18, 2022
Purpose: To create an application that prompts the user for 5 grades 
between 0 and 100 points and stores the grades in an ArrayList. HighestGrade
then traverses the grades to  determine the highest grade and then displays 
the grade along with an appropriate message.
School: CHHS
Course: Computer Science 30
 
*/


//Added class to package
package HighestGrade;

import java.util.Scanner;



public class HighestGrades 

{
		//Main method
		public static void main(String[] args) 
		{
			
			//variable for the highest grade
			int HighGrd = 0;
			
			//User input scanner
			Scanner input = new Scanner(System.in);
			
			
			//Grades array
			int[] grades = new int[5];
			
			
			for (int i = 0; i < 5; i++) 
			{
				
			//Prompts the user to enter grades	
			System.out.println("Please Enter The Grade between 0 and 100");
			grades[i] = input.nextInt();
			
		
			if (grades[i] > HighGrd)
			{
				//If the grade in the array is bigger than the highest grade change highest grade to the number in the array
				HighGrd = grades[i];
				
			}
			

			}
			
			//Outputs the highest grade
			System.out.println("Highest Grade is: " + HighGrd);
			
			input.close();
			
			
		}
}

