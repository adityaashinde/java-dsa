import java.util.Scanner;

class Scanner2{
	public static void main(String []args){
	
		Scanner obj = new Scanner(System.in);

		System.out.println("Dream Company");
		String company = obj.next();

		System.out.println("Dream Package");
		double dreampackage = obj.nextDouble();

		System.out.println("Dream Company =" + company);
		System.out.println("Dream Package =" + dreampackage);
	}
}
