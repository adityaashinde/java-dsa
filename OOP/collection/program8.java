import java.util.*;
class myClass implements Comparable{
	String str = null;

	myClass(String str){
		this.str = str;
	}

	public int compareTo(Object obj){
		return 1;
	}

	public String toString(){
		return str;
	}
}
class TreeSetDemo8{
	public static void main(String[]args){

		TreeSet ts = new TreeSet();

		ts.add(new myClass("Kanha"));
		ts.add(new myClass("Rahul"));
		ts.add(new myClass("Badhe"));
		ts.add(new myClass("Ashish"));

		System.out.println(ts);
	}
}
