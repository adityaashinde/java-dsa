// WAP to find a palindrome number from an array and return its index

import java.io.*;
class palindromeNumbers{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter Array Size");
		int size=Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array Elements:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0; i<arr.length; i++){
			int sum=0;
			int num=arr[i];
			int rev=0;

			while(num!=0){
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(rev==arr[i])
				System.out.println("Palindrome number " +rev+ " found at " +i+ " index ");
		}
	}
}
