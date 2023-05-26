// String are Immutable  and   StringBuffer are Mutable
// String buffered default capacity is 16

class StringBufferDemo{
	public static void main(String[]args){

		StringBuffer str1 = new StringBuffer("Aditya");

		System.out.println(System.identityHashCode(str1));
		str1.append("Shinde");

		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}
}
