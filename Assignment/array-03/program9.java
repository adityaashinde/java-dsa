// WAP to print the second max elements in the array

import java.io.*;
class SecondLargeNum{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array Elements:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		if(size>2){
			for(int i=0; i<arr.length;i++){

				for(int j=i+1; j<arr.length; j++){

					if(arr[i]>arr[j]){
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		else{
			System.out.println("You have Entered size of " +size);
		}
		System.out.println("Second largest num : " +arr[arr.length-2]);
	}
}
