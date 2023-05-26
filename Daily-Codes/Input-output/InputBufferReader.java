import java.io.*;

class InputBufferReader{
	public static void main(String[]args) throws IOException {

		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Batsman Name");
		String batsman = obj.readline();

		System.out.println("Enter Bowler Name");
		String bowler = obj.readline();

		System.out.println("Batsman Name : " + batsman);
		System.out.println("Bowler Name : " + bowler);
	}
}
