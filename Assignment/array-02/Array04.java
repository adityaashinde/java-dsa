// WAP to search element from an array and return its index.

import java.io.*;
class Array04{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of array:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array Elements:");
		for(int i=0; i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter Elements to Search:");
			int search = Integer.parseInt(br.readLine());
		for(int i=0; i<arr.length; i++){

			if(arr[i] == search){
				System.out.println("Elements found at index: = " +i);
			}
		}

	}
}
