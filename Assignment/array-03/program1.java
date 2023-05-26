// program 1
// WAP to print the count of digit in elements of the array
// Input : Array Elements : 02 255 2557
// 		   output : 2  3   4

import java.io.*;
class countDigits{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];

		System.out.println("Enter the elements in array:");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<arr.length;i++){
			int cnt=0;
			int temp= arr[i];
			while(temp!=0){
				cnt++;
				temp=temp/10;
			}
			System.out.println("Count of digit in number " +arr[i]+ " = " +cnt);
		}	
	}
}
