import java.io.*;

class Inputoutputclose{
	public static void main(String[]args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br1.readLine();
		System.out.println("String = "+ str1);

		br.close();

		char ch = (char) isr.read();
		System.out.println("Char = "+ str2);	
	}
}
