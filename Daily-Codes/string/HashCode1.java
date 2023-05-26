class HashCode1{
	public static void main(String[]args){

		String str1 = "Aditya";
		String str2 = "Shinde";

		String str3 = str1 + str2;        // calls the append method (StringBuilderClass)
		String str4 = str1.concat(str2);  // calls the concat method (new String())

		// print strings
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		// print identityHashCode()
		// identityHashCode() calls the address
		System.out.println("IdentityHashCode");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		// print hashCode()
		// hashCode creates the content of the string
		System.out.println("hashCode()");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
