class StringBufferCampare{
	public static void main(String[]args){

		String str1 = "Aditya";

		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));


		String str2 = str1.concat("Shinde");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str2));
		
		System.out.println("-------------");

		StringBuffer sb = new StringBuffer("Aditya");

		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

		sb.append("Shinde");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(System.identityHashCode(sb));
		}
}
