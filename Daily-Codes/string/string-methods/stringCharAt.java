// method     : public char charAt (int index);
// desc       : It return the character located a specified index within the given string
// parameter  : integer(index)
// returntype : character

class StringCharAt{
	public static void main(String[]args){

		String str = "Core2web";

		System.out.println(str.charAt(4));  // 2
		System.out.println(str.charAt(0));  // C
		System.out.println(str.charAt(8));  // StringOutOfBoundsException
	}
}
