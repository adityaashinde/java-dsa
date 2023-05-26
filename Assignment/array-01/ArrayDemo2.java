// WAP to take size of array from user and also take integer elements from user print product of even elements only.

import java.util.*;
class ArrayDemo2{
	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size Elements:");
	int size = sc.nextInt();
	int arr[] = new int [size];
	System.out.println("Enter Array Elements:");

	for (int i=0; i<arr.length; i++){
		arr[i]=sc.nextInt();
               }
	int EvenProduct = 1;
	for (int i=0; i<arr.length; i++){	
		if(arr[i] % 2 == 0){
			EvenProduct = EvenProduct*arr[i];
		}
	}
	System.out.println("Product of Even elements :" + EvenProduct);
	}
}
