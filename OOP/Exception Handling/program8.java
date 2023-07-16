import java.io.*;
class ExceptionDemo1{
	public static void main(String[]args)throws IOException{

		System.out.println("start main");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);

		int data=0;
		try{
			data = Integer.parseInt(br.readLine());
		}catch (NumberFormatException obj){

			System.out.println("Enter Integer data");  // exception handled
		}
		System.out.println("end main");
	}
}
