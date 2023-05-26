// method : public synchronized StringBuffer append (String str);
// desc : Append the <code>String</code> to this <StringBuffer</code>.
// 	- If str is null, the String "null" is appended
// parameter : String
// Return Type : StringBuffer

class AppendMethod{
	public static void main(String[]args){

		StringBuffer sb = new StringBuffer("Adii");
		sb.append("Shinde");
		System.out.println(sb);
	}
}
