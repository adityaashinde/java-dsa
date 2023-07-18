// Question 2
// Write a program that asks the user to enter a number from 0 to 5 and print its spelling, if the entered number is greater than 5 print entered number is greater than 5

import java.io.*;
class SpellNUm{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("Enter Number =");
		num = Integer.parseInt(br.readLine());
		if(num<0)
			num=1;
		if(num>5)
			num=6;

		switch(num){

			case 0:
				System.out.println("Zero");
				break;

			case 1: 
				System.out.println("One");
				break;

			case 2:
				System.out.println("Two");
				break;

			case 3:
				System.out.println("Three");
				break;

			case 4:
				System.out.println("Four");
				break;

			case 5:
				System.out.println("Five");
				break;

			case -1:
				System.out.println("Number is Negative");
				break;

			case 6:
				System.out.println("Number is greater than 5");
				break;
		}
	}
}
