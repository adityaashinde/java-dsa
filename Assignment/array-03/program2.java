// program2
// WAP to reverse each elements in an array
// take size and elements from the user
// Input : 10 26 674 
// Output : 01 62 476

import java.io.*;
class reverseNum{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter Array Size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter the elements in array:");
		
		for (int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(br.readLine());

		for (int i=0;i<arr.length; i++){
			int rev=0;
			int temp=arr[i];

			while(temp!=0){
				int rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			System.out.println(rev);
		}
	}
}
