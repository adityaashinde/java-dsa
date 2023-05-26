// WAP to merge two given points

import java.io.*;
class MergeArray{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array-01 size:");
		int size1 = Integer.parseInt(br.readLine());

		int arr1[] = new int[size1];

		System.out.println("Enter  Array-01 elements:");
		for(int i=0; i<arr1.length; i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter Array-02 size:");
		int size2 = Integer.parseInt(br.readLine());

		int arr2[] = new int[size2];

		System.out.println("Enter Array-02 elements:");
		for(int i=0; i<arr2.length; i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}

		int arr3[] = new int[size1 + size2];
		for(int i=0; i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		for(int i=0; i<arr2.length; i++){
			arr3[size1+i] = arr2[i];
		}
		System.out.println("Merged Array is:");
		for(int i=0; i<arr3.length; i++){		
			System.out.println(arr3[i]);
		}
	}
}
