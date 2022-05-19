/*
Program: SquaresClass.java          Last Date of this Revision: May 16, 2022
Purpose: To create a Squares application that stores the square of an element's 
index in an integer array of 5 elements. For example, the third element, which 
has index 2, should store 4. The application should then display the value of 
each element in the array.
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/


//Put squares class into squares package
package Squares;

import java.util.Scanner;

public class SquaresClass 
{
	
	
	//Squares array 
	static int [] Squares = {0,1,2,3,4};
	
	static int userInput;
		
	//numElements variable retrieves the length of the array
	static int numElements = Squares.length;
	
	
		
		//Main Method
		public static void main(String[] args) 
		{
			Scanner input = new Scanner(System.in);
		
			//Variable for user input
			int userInp;
			
			userInp = input.nextInt();
			
			//Prompts the user to pick a number between 0 and 4 
			System.out.println("What number between 0 and 4 would you like to know the square of?");
			
			

			
			//for loop to go through all elements in the array
			for(int i = 0; i < numElements;i++) 
			{
				Squares[i]= i*i;
			}
			
			//Prints out the square of the users number
			System.out.println(Squares[userInp]);
			
		}
		
	}


