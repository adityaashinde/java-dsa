import java.util.Scanner;

class Scanner1{
	public static void main(String[]args){

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = obj.next();
		System.out.println("Name :" + name);
	}
}
