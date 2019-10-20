package _00_IntroToArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	
	
	
	public static void main(String[] args) {
		
		//1. make an array of 5 Strings
		String[] array = new String[5];
		array[0] = "0";
		array[1] = "1";
		array[2] = "2";
		array[3] = "3";
		array[4] = "4";
		

		//2. print the third element in the array
		//System.out.println(array[2]);
		//3. set the third element to a different value
		//array[2] = "new 2";
		//4. print the third element again
		//System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		//for(int i = 0; i<array.length;i++) {
			//array[i] = "For loop " + i;
			
		//}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		//for(int i = 0; i<array.length;i++) {
			//System.out.println(array[i]);
			
		//}
		
		
		//7. make an array of 50 integers
		int[] arrayint = new int[50];

		//8. use a for loop to make every value of the integer array a random number
		Random rdm = new Random();
		for(int i=0;i<arrayint.length;i++) {
	int ran = rdm.nextInt(50);
		arrayint[i] = ran;
		//System.out.println(arrayint[i]);
		
		
		
		}
		//9. without printing the entire array, print only the smallest number on the array
		
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
