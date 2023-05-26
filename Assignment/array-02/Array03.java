// Print sum of even odd integers

import java.io.*;
class Array03{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size:");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter Array Elements:");

		int EvenSum=0; 
		int OddSum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				EvenSum = EvenSum + arr[i];
			}
			else{
				OddSum = OddSum + arr[i];
			}
		}
		System.out.println("Sum of Even Integers: " + EvenSum);
	        System.out.println("Sum of Odd Integers: " + OddSum);	
	}
}
