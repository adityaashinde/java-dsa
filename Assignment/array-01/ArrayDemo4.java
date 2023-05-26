// WAP to take characters as an input. Print Vowels from the array.

import java.io.*;
class ArrayDemo4{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size:");
	        int size = Integer.parseInt(br.readLine());	
		char arr[] = new char[size];
		System.out.println("Enter Characters:");

		
		for(int i=0; i<arr.length; i++){
			arr[i] = (char)br.read();
			br.skip(1);
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
		
		
				System.out.println("Vowels from the array:" + arr[i]);
			}
		}
	}
}
