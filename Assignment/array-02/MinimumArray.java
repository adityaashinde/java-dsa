// WAP to find the minimum elements from the array

import java.io.*;
class MinimumArray{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter Array Size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array Elements:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int minimum=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<minimum){
				minimum=arr[i];
			}
		}
		System.out.println("Minimum Elements:" + minimum);
	}
}
