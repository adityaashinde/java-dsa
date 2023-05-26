import java.io.*;

class InputBufferReader1{
	public static void main(String[]args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Building Name");
		String name = br.readLine();

		System.out.println("Enter Wing name");
		char wing = (char)br.read();
		br.skip(1);

		System.out.println("Enter Flat no.");
		int flatno = Integer.parseInt(br.readLine());

		System.out.println(name);
		System.out.println(wing);
		System.out.println(flatno);
	}
}
