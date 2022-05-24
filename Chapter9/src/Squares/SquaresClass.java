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

public class SquaresClass 
{
	
	
	//Squares array 
	static int [] Squares = {0,1,2,3,4};
	

		
	//numElements variable retrieves the length of the array
	static int numElements = Squares.length;
	
	
		
		//Main Method
		public static void main(String[] args) 
		{

			
			//Loop goes through all elements in the array
			for(int i = 0; i < numElements;i++) 
			{
				Squares[i]= i*i;
				
	
			}
			
			//Prints out the square of the index
			System.out.println("Squares: " + Squares[0] + " " + Squares[1] + " " + Squares[2] + " " + Squares[3] + " " + Squares[4]);
			 
			
			
			
		}
		
	}

/* SCREEN DUMP

Squares: 0 1 4 9 16

*/
