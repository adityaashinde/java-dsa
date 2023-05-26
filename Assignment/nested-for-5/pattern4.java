// WAP to print all even numbers in reverse order and odd numbers in the standard way. Both separately.  within a range. Take the start and end from user

// Input : Enter start number - 2
// 	   Enter end number - 9
// Output : 
// 	8 6 4 2 
// 	3 5 7 9

import java.io.*;
class Pattern4{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the start and end of Range:");

		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		System.out.println("Even Number:");

		for(int i=end; i>=start; i--){
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();

		
		System.out.println("Odd Number:");

		for(int i=start; i<=end; i++){
			if(i%2==1){
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}
}
