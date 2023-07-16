class Employee{
	int empId = 10;
	String empName = "Aditya";
	static int y = 20;
	
	void empInfo(){

	System.out.println("Employee Id : " + empId);
	System.out.println("Employee Name : " + empName);
	System.out.println("Static : " + y);
	}
}
class MainDemo{
	public static void main(String[]args){

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.empInfo();
		emp2.empInfo();

		emp2.empId = 20;
		emp2.empName = "Amol";
		emp2.y = 1000;

		emp1.empInfo();
		emp2.empInfo();
	}
}
