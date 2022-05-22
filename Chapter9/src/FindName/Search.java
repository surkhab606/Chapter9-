/*
Program: Search.java          Last Date of this Revision: May 18, 2022
Purpose: To create a Search application that utilizes a static method 
to perform a linear search on a String array and a String variable and 
return an int indiciating the position of the String. 
School: CHHS
Course: Computer Science 30
 
*/

//Adds class to package
package FindName;

public class Search 

{
	//Public linear method with string array and string variable
	public static int linear(String[] array, String nameToFind) 
	{
		
		//Index variable
		int index = 0;
		
		//Size variable to determine array length
		int size = array.length;

		//This while loop will continue to run until we find the name we are looking for (nameToFind)
		while ((array[index] != nameToFind) && 
				(index < size - 1)) 
		{
			
			//Counts index
			index += 1;
			
		}
		

		//If the array name equals the nameToFind return index 
		if (array[index].equals(nameToFind)) 
		{

			return(index);
			
		} 
		
		//If otherwise, return -1
		else 
		{
			
			return(-1);
			
		}
	}
}
	
	
