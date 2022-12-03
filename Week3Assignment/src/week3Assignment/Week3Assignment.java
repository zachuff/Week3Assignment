package week3Assignment;

import java.util.Arrays;

public class Week3Assignment {
	
	public static void main(String[] args) 
	{
		
	//declared the ages in an array
		
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			
	//subtracted the first age from the last age
			
			int firstNum = ages[0];
			int lastNum = ages[ages.length - 1];  
			System.out.println(lastNum - firstNum);
			
	//added a new age to the array
			
			int n = ages.length;
	        int newAges[] = new int [n+1]; 
	        int newAge = 99;
	        
	        for (int i = 0; i<n; i++)
	        {
	        	newAges[i] = ages[i];
	        }
	        
	        newAges[n] = newAge;
	        lastNum = newAges[newAges.length - 1];
	        System.out.println(lastNum - firstNum);
	        
	//found the average age
	        
	        int agesLength = newAges.length;
	        int sum = 0;
	        
	        for(int i = 0;  i<newAges.length; i++)
	        {
	        	sum += newAges[i];
	        }
	        int average = sum / agesLength;
	        
	        System.out.println("The average age is " + average);
	        
	//declared names in an array
	        
	        String[] names = {"Sam", "Tim", "Sally", "Tommy", "Buck", "Bob"};
	        
	//found the average name length
	        
			int avgLength = avgNameLength(names);
			System.out.println("The average name length is " + avgLength);
			
	//concatenated the word together
			
			String delimiter = " ";
			
			StringBuilder sb = new StringBuilder();
			for (String name : names) 
			{
				if(sb.length() > 0)
				{
					sb.append(delimiter);
				}
				sb.append(name);
			}
			String nameString = sb.toString();
			System.out.println(nameString);
			
	//found the length of each name
			
			int[] nameLengths = new int [names.length];
			for(int i = 0; i<names.length; i++) 
			{
				nameLengths[i] += names[i].length();
				System.out.println(nameLengths[i]);
			}
			
	//found the sum of all the names
			
			int sum1 = 0; 
			for(int name :nameLengths ) {
				sum1 += name;
			}
			System.out.println(sum1);
	
	//repeated a word 
			
			String word = "Hello";
			int x = 3;
			System.out.println(repeatWord(word,x));
			
	//made a full name
			
			String firstName = "Zac";
			String lastName = "Huff";
			String fullName = createFullName (firstName, lastName);
			System.out.println(fullName);
			
	//found a sum to be true if it is greater than 100 
			
			int[] numArray = new int[4];
			numArray[0] = 30;
			numArray[1] = 40;
			numArray[2] = 42;
			numArray[3] = 56;
			
			System.out.println(sumArray(numArray));
			
			int[] numArray1 = new int[3];
			numArray1[0] = 2;
			numArray1[1] = 5;
			numArray1[2] = 7;
			
			System.out.println(sumArray(numArray1));
			
	//found the average of doubles in an array
			
			double[] grades = new double[3];
			grades[0] = 99.9;
			grades[1] = 84.2;
			grades[2] = 77.5;
			
			System.out.println(calculateAvg(grades));
			
	//found if the average of one array is greater than another
			
			double[] arr1 = {5.3, 6.4, 7.5, 8.6};
			double[] arr2 = {1.0, 2.1, 3.2, 4.8};
			
			System.out.println(greaterAvg(arr1, arr2));
			System.out.println(greaterAvg(arr2, arr1));
			
	//found if it was hot outside and you had enough money it would return true
			
			boolean isHot = true;
			double moneyInPocket = 11;
			
			System.out.println(willBuyDrink(isHot, moneyInPocket));
			
	//found out if you will go outside
			
			boolean day = true;
			double temp = 78;
			
			System.out.println(willBuyDrink(day, temp));
			
	}
	
	//created a method to find the average name length
	
	public static int avgNameLength(String[] names) 
	{
	
		int sum = 0;
		for (String n : names) {
		    sum += n.length();
		}
		return sum / names.length;
	
	}
	
	//created a method to repeat a word
	
	public static String repeatWord (String word, int n) 
	{
		String newString = "";
		for (int i = 0; i < n; i++) {
		    newString += word;
		}
		
		return newString;
		
	}
	
	//created a method to form a full name
	
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	//created a method that returns true if the sum of all digits is greater than 100
	
	public static boolean sumArray (int[] numbers) 
	{
		int sum = 0;
		for (int number : numbers) 
		{
			sum += number;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	
	}
	
	//created a method that finds the average of doubles in an array
	
	public static double calculateAvg (double[] numbers) {
		double sum = 0;
		for(double number : numbers) {
			sum += number;
			
		}
		return sum / numbers.length;
	}
	
	//created a method that finds if the average of an array of doubles is greater than another
	
	public static boolean greaterAvg (double[] arr1, double[] arr2) 
	{
		double sum1 = 0;
		double sum2 = 0;
		double arr1Length = arr1.length;
		double arr2Length = arr2.length;
		double arr1Avg = 0;
		double arr2Avg = 0;
		
		for(int i = 0; i<arr1Length; i++) {
			sum1 += arr1[i];	
		}
		arr1Avg = sum1 / arr1Length;
		
		for(int j = 0; j<arr2Length; j++) {
			sum2 += arr2[j];	
		}
		arr2Avg = sum2 / arr2Length;
		
		if (arr1Avg > arr2Avg) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	//created a method that found if you will buy drink when it is hot outside and there is enough money in pocket
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) 
	{
		
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	//created a method that found if you will go outside
	
	public static boolean goOutside (boolean dayTime, double temp) 
	{
		
		if (dayTime == true && temp > 40.5) {
			return true;
		}
		return false;
	}
}
