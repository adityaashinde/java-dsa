import java.util.*;
class ArrayListDemo{
	public static void main(String[]args){

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20.5f);
		al.add("Adii");
		al.add(40);

		// int size();
		System.out.println(al.size());

		// boolean contains(obj);
		System.out.println(al.contains("Adii"));

		// E remove(int);
		System.out.println(al.remove(3));

		// void add(int E);
		al.add(3, "core2web");
		
		System.out.println(al);

		// Clear();
		al.clear();
		System.out.println(al);
	}
}
