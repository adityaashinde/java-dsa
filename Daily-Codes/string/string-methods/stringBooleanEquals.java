// method     : public boolean equals (Objects anObject);
// desc       : predicate which compares anObject to this. This is true only for Strings return true if anObject is semantically equal to this
// parameter  : Object(anObject)
// returntype : boolean

class StringBooleanEquals{
	public static void main(String[]args){

		String str1 = "Aditya";
		String str2 = new String("Aditya");

		System.out.println(str1.equals(str2));
	}
}
