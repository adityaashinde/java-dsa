// method : public synchronized int indexOf(String str, int fromIndex)
// desc : Finds the first instance of a String in this StringBuffer, starting at given index
// 	If the starting index of a String in this StringBuffer, starting at a given index
// 	If the starting index is less than 0, the search starts at the beginning of this String.
// 	If the starting index is grater than the length of this String, or the subString is not found.

class IndexofMethod{
	public static void main(String[]args){

		StringBuffer str1 = new StringBuffer("Core2web");
		System.out.println(str1.indexOf("e"));
	}
}
