// method      : public string subString(int index);
// desc        : creates a substring of the given string starting at a specified index and ending ata tghe end of given string.
// parameter   : Integer(index of the string)
// return type : String

class SubString{
	public static void main(String[]args){

		String str = "Core2web-Tech";

		System.out.println(str.substring(5));       // web-Tech
		System.out.println(str.substring(0,4));	    // Core
	}
}
