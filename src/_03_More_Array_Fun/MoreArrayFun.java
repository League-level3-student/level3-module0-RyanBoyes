package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		random();
	}
	
	
	
	
	
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStrings() {
		
		String[] strings;
		strings = new String[3];
		strings[0] = "a";
		strings[1] = "b";
		strings[2] = "c";
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		
	}
	
	
	static //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void reverse() {
		
		
		String[] strings;
		strings = new String[3];
		strings[0] = "a";
		strings[1] = "b";
		strings[2] = "c";
		
		for (int i = strings.length-1; i >= 0; i--) {
			System.out.println(strings[i]);
		}
		
		
	}
	
	
	
	static //4. Write a method that takes an array of Strings and prints every other String in the array.
	void everyOther() {
		
		String[] strings;
		strings = new String[3];
		strings[0] = "a";
		strings[1] = "b";
		strings[2] = "c";
		
		for (int i = 0; i < strings.length; i++) {
			
			if(i%2==0) {
			System.out.println(strings[i]);
			}
		}
		
		
		
	}
	
	static //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void random() {
		
		String[] strings;
		strings = new String[3];
		strings[0] = "a";
		strings[1] = "b";
		strings[2] = "c";
		
		
		
		for (int i = 0; i < strings.length; i++) {
			Random r = new Random();
			int ran = r.nextInt(strings.length);
			System.out.println(strings[ran]);
		}
		
		
	}
	
}
