class Skncoe{
	String department = "Entc";
	int studentNo = 600 ;
	int divisions = 6;
	static String hod = "Dr. S.K.Jagtap";

	void clgInfo(){

	System.out.println("Department : "+ department);
	System.out.println("Student No : " +studentNo);
	System.out.println("Divisions : " +divisions);
	System.out.println("Department HOD : " +hod);
	}
}
class Main{
	public static void main(String[]args){

	Skncoe obj1 = new Skncoe();
	Skncoe obj2 = new Skncoe();

	obj1.clgInfo();
	obj2.clgInfo();

	System.out.println("----------------");

	obj2.department = "CS";
	obj2.studentNo = 500;
	obj2.divisions = 5;
	obj2.hod = "Mr.A.V.Deshpande";

	obj1.clgInfo();
	obj2.clgInfo();
	}
}
