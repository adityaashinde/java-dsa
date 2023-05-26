class String1{
	public static void main(String[]args){

		String str1 = "Shinde";
		String str2 = "Aditya";

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		String str3 = str1.concat(str2);

		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
	}
}
