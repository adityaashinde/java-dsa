// Null Pointer Exception

class Demo2{

	void m1(){
		System.out.println("In m1");
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String[]args){

		System.out.println("Start Main");
		Demo2 obj = new Demo2();
		obj.m1();
		obj = null;        // null pointer exception
		obj.m2();
		System.out.println("End Main");
	}
}
