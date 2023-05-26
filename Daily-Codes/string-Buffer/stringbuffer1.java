// String Buffer default capacity is 16

class StringBuffer1{
	public static void main(String[]args){

		StringBuffer sb = new StringBuffer("");
		
		System.out.println(sb.capacity());		// 16
		System.out.println(sb);				// - Blank
		System.out.println(System.identityHashCode(sb));

		sb.append("Aditya");
		System.out.println(sb.capacity());		// 16
		System.out.println(sb);				// Aditya
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.hashCode());

		sb.append("Shinde");
		System.out.println(sb.capacity());		// 16
		System.out.println(sb);				// AdityaShinde
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.hashCode());

		sb.append("Core2web");			
		System.out.println(sb.capacity());		// 34
		System.out.println(sb);				// AdityaShindeCore2web
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.hashCode());
	}
}
