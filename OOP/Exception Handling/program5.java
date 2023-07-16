// NumberFormatException

import java.io.*;
class Demo5{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);

		// enter a string then NumberFormatException Occured
		int data = Integer.parseInt(br.readLine());  // integer data
		System.out.println(data);
	}
}
