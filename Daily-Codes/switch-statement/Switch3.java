class Switch3{
	public static void main (String []args){

		int x = 3;
		System.out.println("Before Switch");

		switch (x){
		
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4: 
				System.out.println("Four");
				break;
			case 5: 
				System.out.println("Five");
				break;
			default:
				System.out.println("Invalid");
				break;
		}
		System.out.println("After Switch");
	}
}
