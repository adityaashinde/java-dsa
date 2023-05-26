// method : public synchronized int lastIndexOf(String str, int fromIndex);
// desc : Finds the last instance of a String in this StringBuffer, startingat a given index
// 	If starting index is greater than the maximum valid index, then the search begins at the end of this String.
// 	If the starting index is less than zeo, or the substring is not found, -1 is returned.
// parameters : String (str String to find).
// Integer (fromIndex index to start the search).
// return type : Integer

class LastIndexOfString{
	public static void main(String[]args){

		StringBuffer str1 = new StringBuffer("Core2web");
		System.out.println(str1.lastIndexOf("e"));
	}
}
