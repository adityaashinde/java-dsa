class Demo1{
	static int x=10;
	static {
		static int y=20;  // error:illagal start
	}

	void fun(){
		static int z=20;  // error
	}

	static void fun(){
		static int z=20;  // error
	}
}

