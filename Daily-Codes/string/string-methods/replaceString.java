// method     : public string replace(char oldChar, char newChar);
// desc       : Repalces every instace of a character in the given string with a new character
// parameter  : character (old character)
// 		character (new character)
// returntype : string

class ReplaceString{
	public static void main(String[]args){

		String str = "AditYa";

	 	System.out.println(str);                        // AditYa
		System.out.println(str.replace('Y','y'));	// Aditya
	}
}
