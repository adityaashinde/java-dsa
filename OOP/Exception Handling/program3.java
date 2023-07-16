// Default Exception Handler
class Demo1{

	void m1(){
		System.out.println("In m1");
	}

	void m2(){
		System.out.println(10/0);  // ArithemeticException : / by zero
		m1();
	}

	public static void main(String[]args){

	Demo1 obj = new Demo1();
	obj.m2();
	}
}

