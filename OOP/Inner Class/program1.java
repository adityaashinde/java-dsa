class Outer{

	class Inner{

		void m1(){
			System.out.println("In m1 Inner");
		}
	}
	void m2(){
		System.out.println("In m2 Outer");
	}

	public static void main(String [] args){

	Inner obj = new Outer().new Inner();
	obj.m1();                           // In m1 Inner

	// calling m2() method
	// Outer obj1 = new Outer();
	// obj1.m2();                       // In m2 Outer
	
	// 2nd method of calling m2()
	// new Outer().m2();                // In m2 Outer
	}
}
