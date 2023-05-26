// method : public synchronized String subString(int beginIndex, int endIndex);
// desc : Creates a substring of this StringBuffer, starting at a specified index and ending at one character
// 	before a specified index
// parameters : Integer (beginIndex index to start at(inclusive, base 0));
// 		Integer (endIndex index to end at exclusive));
// 		String (str the new <code>String</code>to insert);
// Return Type : String

class SubStringMethod{
	public static void main(String[]args){

		StringBuffer str1 = new StringBuffer("Know The Code Till The Core");
		String str2 = str1.substring(14,27);
		System.out.println(str2);
	}
}
