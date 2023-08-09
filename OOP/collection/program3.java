import java.util.*;

class Kilometer{
	String city=null;
	int km=0;

	Kilometer(String city, int km){
		this.city = city;
		this.km = km;
	}

	public String toString(){
		return ("city name :" + city + " km :"+ km);
	}
}

class ArrayListDemo3{
	public static void main(String[]args){

		ArrayList al = new ArrayList();

		al.add(new Kilometer("Pune",65));
		al.add(new Kilometer("Mumbai",157));
		al.add(new Kilometer("Nashik",206));
		al.add(new Kilometer("Satara",215));

		System.out.println(al);
	}
}
