class StringHashCode{
	public static void main(String[]args){

		String str1 = new String("Aditya");
		String str2 = new String("Aditya");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		if(str1==str2)
			System.out.println("true 1");
		if(str1.equals(str2))                   // equals method check the content of the string
			System.out.println("true 2");
		if(str1.hashCode() == str2.hashCode())  // ( == ) operator check the HashCode()
			System.out.println("true 3");
	}
}
