// WAP to take size of array from user and also take integer elements from user print product of odd index only.

import java.util.*;
class ArrayDemo3{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements:");

		int mult=1;
		for (int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();

			if(i%2==1){
				mult= mult*arr[i];
			}
		}
		System.out.println("Product of Odd Index : " + mult);
	}
}
