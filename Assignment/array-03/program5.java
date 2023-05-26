// find the perfect number from an array and return its index.
// take size and elements from the user

import java.io.*;
class perfectNumbers{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array Elements of the array:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0; i<arr.length; i++){
			int sum=0;
			for(int j=1; j<=arr[i]; j++){

				if(arr[i]%j==0)
				sum=sum+j;
			}
				if(sum==arr[i]){
					System.out.println("Perfect number " +arr[i]+ " found at " +i+ " index ");
			}	
		}
	}
}
