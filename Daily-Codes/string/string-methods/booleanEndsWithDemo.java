// method : public boolean endsWith(String suffix);
// desc : predicate which determines if the string ends with given string.
// 	  if the suffix is an empty String, true is returned.
// 	  throws NullPointerException if suffix is null
// parameter : prefix String to compare
// return Type: boolean

class BooleanEndsWithDemo{
	public static void main(String[]args){

		String str1 = "Know the code till the core";
		System.out.println(str1.endsWith("core"));
	}
}
