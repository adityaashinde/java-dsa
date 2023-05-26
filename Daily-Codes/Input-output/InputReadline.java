import java.io.*;

class InputReadline{
	public static void main(String []args) throws IOException{

		BufferedReader br1 = new BufferedReader (new InputStreamReader(System.in));

		BufferedReader br2 = new BufferedReader (new InputStreamReader(System.in));

		String str1 = br1.readLine();
		System.out.println("String 1 : " + str1);

		String str2 = br2.readLine();
		System.out.println("String 2 : " + str2);
	}
}
