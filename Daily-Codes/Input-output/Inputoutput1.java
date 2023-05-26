import java.io.*;
import java.util.*;

class Inputoutput{
	public static void main(String[]args) throws IOException {

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter Buliding Name, Wing, Flat No ");
		String info = br.readLine();

		System.out.println(info);
		
		StringTokenizer obj = new StringTokenizer((info)," ");
		
		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		String token3 = obj.nextToken();

		System.out.println("Building Name = " + token1);
		System.out.println("Wing Name = " + token2);
		System.out.println("Flat No = " + token3);

		}
}

