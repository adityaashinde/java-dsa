// method     : public int compareTo(String str)
// desc       : It compares the str1 and str2 (case sensitive).
//              if both strings are equal it returns 0 otherwise return the comparision
// parameter  : String(second string)
// returntype : integer

class StringCompareTo{
	public static void main(String[]args){

		String str1 = "Aditya";
	        String str2 = "aditya";

		System.out.println(str1.compareTo(str2));
	}
}
