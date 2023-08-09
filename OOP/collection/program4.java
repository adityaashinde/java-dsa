import java.util.*;
class CompanyInfo{

	String compName=null;
	int empCount=0;

	public CompanyInfo(String compName, int empCount){

		this.compName = compName;
		this.empCount = empCount;
	}

	public String toString(){
		return ("Company Name :" +compName+ " Employee's :" +empCount +" **** ");
	}
}
class ArrayListDemo4{
	public static void main(String[]args){

		ArrayList al = new ArrayList();
		al.add(new CompanyInfo("Biencaps",25));
		al.add(new CompanyInfo("Core2web",35));
		al.add(new CompanyInfo("Incubator",15));

		System.out.println(al);
	}
}
