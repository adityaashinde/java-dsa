// WAP and take two characters if these characters are equal then print them as it is but if they are unequal then print their difference.
// Note : positional difference
// Input : a p
// o/p : The difference between a and p is 15

import java.io.*;
class Pattern6{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter Two Characters:");
		
		char ch1 = (char)br.read();
		br.skip(1);
		char ch2 = (char)br.read();


			if(ch1 == ch2)
				System.out.println("The two characters are same");
			else{
				int diff = ch1-ch2;

				if(diff < 0){
					diff = diff * (-1);
				}

				System.out.println("The difference between " + ch1 +" and " + ch2 +" characters is " + diff );
				
			}
	}
}
