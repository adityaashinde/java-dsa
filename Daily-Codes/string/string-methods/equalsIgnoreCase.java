// method     : public boolean equalsIgnoreCase(String another String);
// desc       : Compares string to this string ignoring case.
// paramater  : String(str)
// returntype : boolean

class EqualsIgnoreCase{
	public static void main(String[]args){

		String str1 = "ADITYA";
		String str2 = "aditya";

		System.out.println(str1.equalsIgnoreCase(str2));  // true

		String str3 = "CORE2WEB";
		String str4 = "Core2web-Tech";

		System.out.println(str3.equalsIgnoreCase(str4));   // false
	}
}
