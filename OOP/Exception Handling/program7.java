// ArithmeticException using try catch 

import java.io.*;
class ExceptionDemo{
	public static void main(String[]args){
	
	System.out.println("Start main");
	
	try{
		System.out.println(10/0);    // risky code
	}catch(ArithmeticException ae){
		System.out.println("Exception occured");   // exception handled
	}
	System.out.println("End main");
	}
}

