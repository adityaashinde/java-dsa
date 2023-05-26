// Jagged Array take value from user using ForEachLoop

import java.io.*;
class JaggedforeachLoop{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[1];

		System.out.println("Enter Array Elements:");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		for(int [] x : arr){
			for(int y : x){
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}
}
