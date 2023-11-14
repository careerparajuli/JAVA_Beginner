/**
 * This documents includes 

a) Data Types
b) If Else Statement
c) Switch Statement
d) Loops: for, while, do while, enhanced for loop
e) Math's Operations
f) Keyboard Inputs
g) UpperCase-LowerCase Conversion
h) CompareTo method
i) Arrays, two dimensional array, Strings in array
j) String: creating strings, equal method, compareTo method, 
			concatenate, length, reading character, reading and pasting in array,
			searching (index), replacing string
k) 
 */

import java.util.Scanner;

public class MasterDocument1 {
	public static void main (String [] args) {
		System.out.println ("Hello World");
		
		System.out.println("\n");
		
		//Data Types
		String name= "Ujjwal";
		int age1 = 28;
		double weight = 149.50;
		char firstLetter= 'D';
		boolean male = true;
		
		System.out.println("My name is " +name);
		System.out.println("My age is " + age1);
		System.out.println("My weight is " + weight);
		System.out.println("My first letter character is " +firstLetter);
		System.out.println("My gender is male. " + male);
		
		System.out.println("\n");
		
		
		//If else Statement
		int age=28;
		// For integers 	
			if (age <= 10)
				System.out.println("You are a child.");
			else if (age <= 50)
				System.out.println("Your are an adult.");
			else 
				System.out.println("You are old person");
			
			System.out.println("\n");
			
			
		// For strings
			String name1 = "Ujjwal";
			if (name.equals ("Ujjwal")){
			System.out.println("My first name is " + name1);
		}
			else
			{
				System.out.println("n/a");
			}
			
		// For char
			char lastName = 'a';
			if (lastName =='a'){
				System.out.println("My last name is Parajuli" );
			}
				else
				{
					System.out.println("n/a");
				}
			
			System.out.println("\n");
			
			//Conditional Expression if Else AND == )R != && || ^(X-OR)   !(NOT)
			
			String names= "Ujjwal";
			int income1 = 10000;
			String roommate= "Pratik";
			int income2 = 20000;
			char lastname= 'P';
			char lastNameRoomate= 'B';
			
			if ((names.equals("Ujjwal") && income1==10000) && lastname== 'P')
				System.out.println( names + " is a rich guy.");
			else if(roommate.equals("Praik") ||( income2==20000 || lastNameRoomate== 'B'))
				System.out.println( names + " is a poor guy.");
			else 
				System.out.println( names + " is a super rich guy.");
		
			
			System.out.println("\n");
			
			// Switch Statement
			
			int month = 1;
			String monthString;
			switch (month) {
			case 1: monthString = "January";
					break;
			case 2: monthString = "Febrauary";
					break;
			case 3:  monthString = "March";
	        		break;
			default: monthString = "Invalid month";
			        break;
			}
			System.out.println(monthString);
			
			/*
			 * Using strings 
			 */
			String grades = "B";
			switch(grades) {
			case "A":
				System.out.println("You are a good sudent. ");
			break;
			case "B":
				System.out.println("You are a average sudent. ");
			break;
			case "C":
				System.out.println("You are a poor student. ");
			break;
			case "D":
				System.out.println("You are a  failed student. ");
			break;
			default:
				System.out.println("Default");
			}
			
			System.out.println("\n");
			
			// For Loop
			int num2;
			int counter=0;
			for (num2=0; num2<=6; num2= num2+2) {
				counter++;
				System.out.println("Numbers are: "+num2);
			}
			System.out.println("Counter is: "+counter);
			
			System.out.println("\n");
			
			//For loop character
			char character;
			for (int i=65; i<=70; i++) {
				character = (char) i;
				System.out.println("Character corresponding to ASCII character "+i+" is: "+character);
			}
			System.out.println("\n");
			
			//while loop for integer
			int i=1;
			int sum=0;
			while(i<=5) {
				System.out.println("While loop: "+ i);
				sum=sum+i;
				i++;
				
			}	
			System.out.println("Sum is: "+sum);
			
			//while loop for char
			char letter= 'W';
			while (letter<='Z') {
				System.out.println("while loop char: " + letter);
				letter++;
			}
			
			System.out.println("\n");
		
			// do-while loop
			// It is executed at-least once 
			int m=10;
			do {
				System.out.println("Do-while loop: "+m);
				m++;
			}while (m<=15);
					
			//Math square
			double number= 33.337;
			double answer1;
			answer1 = Math.sqrt(number);
			System.out.println("The square of a number is "+ answer1);
			
			System.out.println("\n");
			
			//Math exponential
			
			double number3= 33.337;
			double answer3;
			answer3= Math.exp(number3);
			
			System.out.println("The exponent of the number is "+answer3);
			
			System.out.println("\n");
			
			//Math absolute value numbers
			
			double numbe3= -3.3;
			double answe3;
			answe3= Math.abs(numbe3);
			
			System.out.println("The absolute of the number is "+answe3);
			
			System.out.println("\n");
			
			//Math round
			System.out.println("Math round: "+Math.round(-3.338));
			System.out.println("Math floor: "+Math.floor(3.558)); //Goes down
			System.out.println("Math ceiling: "+Math.ceil(3.123)); //Goes up
			System.out.println("Math power: "+Math.pow(3, 2)); // Power function
			System.out.println("Math squareroot: "+Math.sqrt(16)); //Square-root function
			System.out.println("Math PI: "+Math.PI); //Pi 
			System.out.println("Math log: "+Math.log10(10.0)); //Math log
			System.out.println("Math degree: "+Math.toDegrees(Math.PI)); //Changes radiant to degrees
			System.out.println("Math radiant: "+Math.toRadians(180)); //Changes degrees to radiant
			System.out.println("Math sin: "+Math.sin(45)); //sin of  45 radiant
			System.out.println("Math sin: "+Math.sin(Math.toDegrees(45))); //sin of  45 degree
			System.out.println("Math cos: "+Math.cos(45)); //cos of  45 radiant
			System.out.println("Math cos: "+Math.cos(Math.toRadians(45))); //cos of  45 degree

			
			System.out.println("\n");
			
			// Char data type
			char firstLetters= 'U';
			char secondLetter= 'j';
			char thirdLetter= 'w';
			char fourthLetter= 'a';
			char fifthLetter= 'l';
			
			//Incrementing  UNI character
			firstLetters++;
			secondLetter++;
			thirdLetter++;
			fourthLetter++;
			fifthLetter++;
			
			System.out.println(firstLetters+""+secondLetter+""+thirdLetter+""+fourthLetter+""+fifthLetter);
			
			System.out.println("\n");
			//Incrementing variables
			
			int z=2;
			int y=1;
			z++;
			--y;
			System.out.println("New value "+ z);
			System.out.println("New value "+ y);
			
			System.out.println("\n");
			
			/**
			 * Taking input from keyboard
			 *
			Scanner sc = new Scanner(System.in);
			
			int i= sc.nextInt();		//Keyboard input integer		
			String j= sc.next();		//Keyboard input string
			double k= sc.nextDouble();	//Keyboard input double
			
			System.out.println(i);
			System.out.println(j);
			 */
		
			//Changing to Upper-case and Lower-case:
			
			String caste= "BrahaMIN";
			
			System.out.println(caste.toLowerCase());
			System.out.println(caste.toUpperCase());
			System.out.println("\n");
			
			//Break and continue statement
			
			for (int k=0; k<=3; k++) {
				
				if(k==2) break;
				System.out.println(k);
			}
			
			System.out.println("\n");
			
			for (int k=1; k<=10; k++) {
			if (k%3==0) {
				System.out.println(k+" It is multple of three.");
			continue;
			}
			System.out.println(k);
			}
			System.out.println("\n");
			
		
			//Comparing two strings (ComapreTo)
			
			String str1= "Hello people";
			String str2= "Hello man";
			
			System.out.println(str1);
			System.out.println(str2);
			
			if (str1.compareTo(str2)>0)
					System.out.println("str 1 comes before str2");
			else if (str1.compareTo(str2)<0)
				System.out.println("Str 2 comes beofre str1");
				else
					System.out.println("Both strings are equal");
			
			//Arrays
			int ages[] = new int [5];
			int height[]= {4,5,6,7,8,9};
			int weight1[]= {89,44,55,66,77,91,99,67,89};
			
			//Finding minimum and maximum of the weight
			int minimum= weight1[0];
			int maximum= weight1[0];
			for (i= 0; i<9;i++) {
				
				if (weight1[i]<minimum)   minimum=weight1[i];
				if (weight1[i]>maximum)	 maximum = weight1[i];
			}
			System.out.println(weight1[0]);
			System.out.println("Minimum value is: "+minimum);
			System.out.println("Maximum value is: " +maximum);
			
			//Calculating the length of the array.
			System.out.println("The length of the array is: "+ weight1.length);
			// if we use length method in for loop we need to do length()-1;
			
			//for printing all elements in the array
			for ( i= 0; i< weight1.length-1; i++) {
				System.out.print("  "+weight1[i]);
			}
			System.out.println("\n");
			//Enhanced for loop
			for (int number1:weight1) {
				System.out.print(" "+ number1);
			}
			
			System.out.println("\n");
			
			for ( i=0;i<9;i++) {
				System.out.println("Weights is: "+weight1[i]);
			}
			for ( i=0; i<5; i++) {
				ages[i]=i+5;
				System.out.println("Ages is :" +ages[i]);
			}
			
			ages[0]=4;
			ages[1]=5;
			ages[2]=3;
			ages[3]=2;
			ages[4]=6;

			System.out.println("Age is: "+ages[4]);
			System.out.println("Height is : "+height[5]);
			
			//Two dimentional array
			//	2	4	8	4
			//	11	12	9	5	
			//	10	3	2	-2
			
			int table [][] = new int [3][4];
			table [0][0]= 2;
			table [0][1]= 4;
			table [0][2]= 8;
			table [0][3]= 4;
			
			table [1][0]= 11;
			table [1][1]= 12;
			table [1][2]= 9;
			table [1][3]= 5;
			
			table [2][0]= 10;
			table [2][1]= 3;
			table [2][2]= 2;
			table [2][3]= -2;
			
			System.out.println(table[0][0]+ " "+ table[0][1]+" "+ table[0][2]+" "+ table[0][3]);
			System.out.println(table[1][0]+ " "+ table[1][1]+" "+ table[1][2]+" "+ table[1][3]);
			System.out.println(table[2][0]+ " "+ table[2][1]+" "+ table[2][2]+" "+ table[2][3]);
			
			
			//String objects
			String str= new String ("My name is Ujjwal");
			String str11= new String ("My last name is Parajuli Ujjwal is.");
			
			//Other way of creating string
			String str22= "Ujjwal";
			String str3= "Parajuli";
			String str4= "ujjwal";
			
			//Comparing Strings: Equal method
			System.out.println("Is str22 and str4 equal: "+str22.equals(str4));
			System.out.println("Is str22 equal to.... "+str22.equals("Ujjwal"));
			
			//Compare to method for strings
			if (str22.compareTo(str4)>0)
				System.out.println("str22 comes after str4");
			else if (str22.compareTo(str4)<0)
				System.out.println("str22 comes before str4");
			else
				System.out.println("str22 and str4 are equal");
			
			//Concatenate of Strings
			String fullName= str22+ " "+str3;
			System.out.println("Full name: "+fullName);
			
			//Length of the String
			System.out.println("Length of the string str22 is : "+str22.length());
			
			//reading character of the string
			System.out.println("character at position 1 is: "+ str3.charAt(1));
			//Reading characters and pasting in array
			char array3[]= new char[20];
			str.getChars(3, 7, array3, 0);
			System.out.println(array3[0]+" "+ array3[1]+ " "+array3[2]+ " "+array3[3]);
			
			
			//Searching the string (-1 means no such strings)
			System.out.println("Index of 'Ujjwal' is: "+ str11.indexOf("Ujjwal"));
			//Searching the last string
			System.out.println("Index of last occurance 'is' is: "+ str11.lastIndexOf("is"));
			
			//Array of the strings
			String details[]= {"My", "name", "is", "Ujjwal", "Parajuli" };
			System.out.println("Array string: "+ details[3]);
			
			//Changing string in array
			details[3]= "UJJWAL";
			System.out.println("Array string: "+ details[3]);
			
			// Replace method
			System.out.println("Repalce method1: "+str.replace("is", "isnot"));
			System.out.println("Repalce method2: "+str.replace('i', 'I'));
			System.out.println(str);
			System.out.println(str11);
			System.out.println(str22);
			System.out.println(str3);
	}
}
