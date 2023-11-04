class Demo{
	static {
		System.out.println("Static Block 1");
	}
	public static void main(String[]args){
		System.out.println("In Demo");
	}
}

class Client{
	static {
		System.out.println("Static Block 2");
	}
	public static void main(String[]args){
		System.out.println("In Client Main");
	}
	static {
		System.out.println("Static Block 3");
	}
}
