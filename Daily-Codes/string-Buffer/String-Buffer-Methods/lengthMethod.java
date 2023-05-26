// method : public synchronized int length();
// desc : Get the length of the <code> String </code> this <code> StringBuffer </code> would crete.
// 	Not to be confused with the <em>capacity</em> of the <code>StringBuffer</code>.
// parameters : No parameter
// Return type : Integer

class LengthStringDemo{
	public static void main(String[]args){

		StringBuffer str1 = new StringBuffer("Core2web");
		System.out.println(str1.length());
	}
}
