// method : public String toString();
// desc : Convert this <code> StringBuffer </code> to a <code>String</code>
// 	The String is composed of the characters currently in this StringBuffer.
// 	Note that the result is a copy, and that future modifications to this buffer do not affect the String.
// parameters : No parameter
// return type : String(the characters in this StringBuffer).

class ToStringMethod{
	public static void main(String[]args){

		StringBuffer str1 = new StringBuffer("Know the Code Till the Core");
		String str2 = "Core2Web";
		String str3 = str1.toString();
		String str4 = str2.concat(str3);
		System.out.println(str4);
	}
}
