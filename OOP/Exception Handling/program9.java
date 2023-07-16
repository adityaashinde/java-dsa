// finally Block

class FinallyDemo{

	
	void m1(){
		System.out.println("In m1");
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String[]args){

		System.out.println("start main");

		FinallyDemo obj = new FinallyDemo();
		obj.m1();

		obj = null;

		try{
			obj.m2();
		}catch (NullPointerException obj2){

			System.out.println("here");
		}finally{
			System.out.println("Connection closed");
		}
		System.out.println("end main");
	}
}

