import java.util.*;
class CricPlayer{
	int number=0;
	String name=null;

	CricPlayer(int number, String name){
		this.number = number;
		this.name = name;
	}

	public String toString(){
		return (number + " : " + name);
	}
}
class LinkedListDemo2{
	public static void main(String[]args){

		LinkedList ll = new LinkedList();

		ll.add(new CricPlayer(18, "Virat"));
		ll.add(new CricPlayer(7, "Mahi"));

		System.out.println(ll);
	}
}
