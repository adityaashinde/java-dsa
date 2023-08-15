import java.util.*;
class Movies implements Comparable{

	String movieName = null;
	float totalColl = 0.0f;

	Movies(String movieName, float totalColl){
		this.movieName = movieName;
		this.totalColl = totalColl;
	}

	public int compareTo(Object obj){
		return movieName.compareTo(((Movies)obj).movieName);
	}

	public String toString(){
		return movieName;
	}
}
class TreeSetDemo9{
	public static void main(String[]args){

		TreeSet ts = new TreeSet();

		ts.add(new Movies("Gadar2",150.0f));
		ts.add(new Movies("Rocky",175.0f));
		ts.add(new Movies("Jailer",200.0f));
		ts.add(new Movies("Omg2",100.0f));

		System.out.println(ts);
	}
}

