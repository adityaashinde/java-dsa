class Outer{
	void m1(){
		System.out.println("In m1 Outer");

	// method local Inner class
	class Inner{
		void m1(){
			System.out.println("In m2 Inner");
			}
		}
		// compulsory object of Inner class is created here only
		Inner obj = new Inner();
		obj.m1();                // In m1 Inner
	}
	void m2(){
		System.out.println("In m2 Outer");
	}

	public static void main(String []args){

		Outer obj = new Outer();
		obj.m1();			// In m1 Outer
		obj.m2();			// In m2 Outer
	}
}


