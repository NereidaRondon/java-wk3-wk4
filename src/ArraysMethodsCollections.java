import java.util.*;

public class ArraysMethodsCollections {

	/**
	 * Main method for this collection
	 * @param args
	 */
	public static void main(String[] args) {
		
//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93 ✔️
		
//	a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  ✔️
//	b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).✔️
//	c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.✔️
		
		System.out.println("#1");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int size = ages.length-1;
		System.out.println("A. This is 93-3=" + (ages[size]-ages[0]));
		

		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 38};
		System.out.println("B. This is 93-38=" + (newAges[newAges.length-1]-ages[0]));
		
		double total = 0;
		for(int i=0; i < ages.length;i++) {
			total += ages[i];
		}
		System.out.println("C. Average age: "+ total/ages.length);
		
//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.✔️
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//	a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.✔️
//	b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.✔️
		System.out.println("\n" + "#2:");
		
		int totalLetters = 0;
		String concatNames= "";
		
		for (String name:names) {
			totalLetters += name.length();
			concatNames += name + " ";
			
		}
		double averageLetters = totalLetters/names.length;
		System.out.println("A. Average letters per name: " + averageLetters);
		System.out.println("B. Concatenated names: " + concatNames);
		
		
//3.	How do you access the last element of any array?✔️
		System.out.println("\n" + "#3:");
		System.out.println("Last element of an array: " + ages[ages.length-1]);
				
		
//4.	How do you access the first element of any array?✔️
		System.out.println("\n" + "#4:");		
		System.out.println("First element of an array: " + ages[0]);
				
//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.✔️
		System.out.println("\n" + "#5:");
		
		int[] nameLengths = new int[names.length];
							
			for(int i=0; i<names.length; i++) {
				
				nameLengths[i]= names[i].length();
			}
		System.out.println("Array: " + Arrays.toString(nameLengths));
				
		
		
//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.✔️
		System.out.println("\n" + "#6:");
		int sum=0;
		for(int i=0; i< nameLengths.length; i++ ) {
			sum += nameLengths[i];
		}
		System.out.println("Sum of elements: "+ sum );
		
//7.		
		System.out.println("\n" + "#7:");
		myConcatMethod("Hello", 3);
		
//8.		
		System.out.println("\n" + "#8:");
		printFullName("Betty", "Boop");	
		
//9.		
		System.out.println("\n" + "#9:");
		int[] arr200 = {50, 60, 70, 20};
		greaterThan100(arr200);
		
//10.		
		System.out.println("\n" + "#10:");
		double [] array4 = {2.5, 7.5, 3.2, 1.8, 5.0};
		System.out.println("Average of array1: " + averageOfArray(array4));
		
		System.out.println("\n");
		
		double [] array313 = {6.45, 1.25, 4.15, 2.8, 1.0};
		System.out.println("Average of array2: " + averageOfArray(array313));
		
//11.		
		System.out.println("\n" + "#11:");
		greaterAverage(array4, array313);
		System.out.println("Is array1 greater than array2? " + greaterAverage(array4, array313));

//12.
		System.out.println("\n" + "#12:");
		boolean isHotOutside=true;
		double moneyInPocket= 11.00;

		System.out.println("isHotOutside = " + isHotOutside);
		System.out.println("moneyInPocket = " + moneyInPocket);
		
		System.out.println("Both are true? " + willBuyDrink(isHotOutside, moneyInPocket));
		
//13.
		System.out.println("\n" + "#13:");
		double radius = 4.5;
		System.out.println(findCircleArea(radius));
		
	}
	
//METHODS
	
//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).✔️
		
	  static void myConcatMethod(String word, int n) {
		      		
		  String concatHello="";
		  for(int i=0; i<n;i++) {
			  concatHello += word; 
		  }
		System.out.println(concatHello);
	  }
		
	  
//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).✔️
	  
	  static void printFullName(String firstName, String lastName){
		 System.out.println("Full name: "+ firstName + " "+ lastName); 
	  }
	  
	  
//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.✔️
	  public static void greaterThan100(int[] array){
		  int arraySum=0;
		  for (int num : array) {
			  arraySum += num; 			  
		  }
			if(arraySum > 100) { 
				System.out.println("Sum: " + arraySum);
				System.out.println("Is sum > 100? " + true); 
		  }
	  };
	  		
//10.	Write a method that takes an array of double and returns the average of all the elements in the array.✔️
	  public static double averageOfArray(double[] arr){	

		  double average = 0;
		  for(int i=0; i< arr.length; i++) {
			  average += arr[i];
		  }
		  double arrAverage = average/arr.length;
		  return arrAverage;
	  }
	  
	  
//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.✔️
	  public static boolean greaterAverage(double[] arr1, double[] arr2){
		  
		  if(averageOfArray(arr1) > averageOfArray(arr2)) {
			  return true;
		  } 
			  return false;
	  }
	  
//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.✔️
	  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		  if(isHotOutside && moneyInPocket > 10.5) {
			  return true;
		  }
		  return false;
	  }
	  
	  
//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.	
	  //Given a radius, r, the method findCircleArea can calculate the area of a circle in terms of pi.
	  public static String findCircleArea(double r) {
		  double squared = r*r;
		  String pi = "\u03c0";
		  System.out.println("With a radius of "+ r +" the area of the circle is:");
		  return (squared + pi);
		  
	  }
	  
}
