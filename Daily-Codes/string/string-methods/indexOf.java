// method      : public int indexOf(char ch, int from IndexOf);
// desc        : finds the first instance of the character in the given string.
// parameter   : character(ch to string)
// return type : Integer

class IndexOf{
	public static void main(String[]args){
     
		String str = "Shashi";

		System.out.println(str.indexOf('h',0));
		System.out.println(str.indexOf('h',1));
		System.out.println(str.indexOf('h',4));
	}
}
