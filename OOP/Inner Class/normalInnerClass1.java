class Outer{

	class Inner{

		void m1(){
			System.out.println("In m1 Inner");
		}
	}

	void m2(){
		System.out.println("In m2 Outer");
	}

}
class Client{
	public static void main(String [] args){

		Outer obj = new Outer();
		obj.m2();
		
		Outer.Inner obj1 = obj.new Inner();
		obj.m1();
	}
}
