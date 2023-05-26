// method : public synchronized StringBuffer insert(int offset, String str);
// desc : Imsert the <code>String</code> argument into this <code>StringBuffer</code>.
// 	If str is null, the String "null" is used instead.
// paramater : Integer (Offset the phase to insert)
// 	       String (str the <code>String</code> to insert
// return type : StringBuffer

class InsertMethod{
	public static void main(String[]args){

		StringBuffer sb = new StringBuffer("AdityaCore2web");
		System.out.println(sb);

		sb.insert(6, "Shinde");
		System.out.println(sb);
	}
W}
