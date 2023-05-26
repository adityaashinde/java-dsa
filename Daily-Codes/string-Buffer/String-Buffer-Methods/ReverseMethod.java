// method :public synchronized StringBuffer reverse();
// desc : Reverse the characters in this StringBuffer.
// 	 The same sequence of characters exists, but in the reverse index ordering.
// parameter : No parameter
// return type : StringBuffer

class ReverseMethod{
	public static void main(String[]args){

		String str1 = "Core2web";
		StringBuffer sb2 = new StringBuffer(str1);
		str1 = sb2.reverse().toString();
		System.out.println(str1);
	}
}
