class StringDemo{
	public static void main(String[]args){

		String str1 = "Core2web";
		String str2 = new String("Core2web");

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		String str3 = "Core2web";
		String str4 = new String("Core2web");

		System.out.println(str3);
		System.out.println(str4);

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
