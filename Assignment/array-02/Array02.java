// WAP to find the number of even and odd integers in a given array of integers
// Input: 1 2 5 4 6 7 8
// Output: Number of Even Elements: 4
// 	   Number of Odd Elements : 3

import java.io.*;
class Array02{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter Array Size:");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter Array Elements:");

		int EvenCount=0;
		int OddCount=0;
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				EvenCount++;
			}
			else{
				OddCount++;
			}
		}
		System.out.println("Number of Even Elements:" + EvenCount);
		System.out.println("Number of Odd Elements:" + OddCount);
	}
}
