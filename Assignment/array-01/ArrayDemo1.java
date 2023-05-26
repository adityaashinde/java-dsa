// WAP to take size of array from user and also take integer elements from user prints sum of odd elements only

import java.util.*;
class ArrayDemo1{
	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Array Size:");
	int size = sc.nextInt();
	int arr[] = new int [size];
	System.out.println("Enter Array Elements");

	for (int i=0; i<arr.length; i++){
		arr[i] = sc.nextInt();
		}
	int Oddcount = 0;
	for (int i=0; i<arr.length; i++){
		if(arr[i] % 2 != 0){
			Oddcount = Oddcount + arr[i];
		}
	}
	System.out.println("Sum of Odd Elements:" + Oddcount);
	}
}
