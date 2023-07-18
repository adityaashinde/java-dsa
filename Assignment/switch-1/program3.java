import java.io.*;
class MultNumber{
	public static void main(String[]args)throws IOException{

		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;

		System.out.println("Enter first number:");
		// num1 = sc.nextInt();
		num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter second number:");
		// num2 = sc.nextInt();
		num2 = Integer.parseInt(br.readLine());

		if(num1<0 || num2<0){
			System.out.println("Negative numbers are not allowed");
		}
		else{
			switch((num1*num2) % 2){
				
				case 0:
				System.out.println("The multiplication is even");
				break;

				case 1:
				System.out.println("The multiplication is odd");
				break;
			}
		}
	}
}
