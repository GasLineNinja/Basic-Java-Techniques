/*********************************************************************************************
 * Michael Strand
 * CompSci 251 Program 01
 * 
 * Review of 250 techniques 
 * Due January 29th, 2020
 * @author mstra
 *
 *********************************************************************************************/
import java.util.*;

public class CS251Program01 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);

		int input;
		String response;
		String newString;
	
		//Initializing loop asking for user input
		do
		{
			//print statement asking user for integer input
			System.out.println("Please enter an integer. [0, ?]");
			input = stdIn.nextInt();

			//Calling method
			newString = arrStr(input);

			//Asking user for another integer 
			System.out.println("\nWould you like to enter another integer? [y , n]");
			response = stdIn.next();


			if (!(response.equalsIgnoreCase("y")))
			{
				break;
			}

		} while (!(response.equalsIgnoreCase("n")) || (response.equalsIgnoreCase("y")));

	}	

	public static String arrStr(int input)
	{
		int vowelCount = 0; 

		//creating array of length given by user input
		char[] arr = new char[input];

		if (input >= 0)
		{

			//placing random character in array indices
			for (int i = 0; i < arr.length; i++)
			{
				Random ranChar = new Random();
				arr[i] = (char) (ranChar.nextInt(26) + 'a');
			}
			//searching for smallest value in array and swapping it for the first index
			char minSoFar = arr[0];
			int smallIndex = 0;
			
			for (int i = 1; i < arr.length; i++)//NOT WORKING!!!
			{
				if (arr[i] < minSoFar)
				{
					minSoFar = arr[i];
					smallIndex = i;
				}

			}
			
			int temp = arr[0];
			arr[0] = arr[smallIndex];
			arr[smallIndex] = (char)temp;

		}

		//making a String out of the contents of the array
		String str = Arrays.toString(arr);

		//counting vowels
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
					str.charAt(i) =='o' || str.charAt(i) == 'u')
			{
				++ vowelCount;
			}
		}

		//printing the string with vowel count and length of string
		System.out.println(str + " " + vowelCount);
		System.out.println("Length of String: " + "[" + str.length() + "]");

		return "";
	}
}
