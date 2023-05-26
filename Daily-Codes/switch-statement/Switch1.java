// Switch Statements

class Switch1{
	public static void main(String[]args){

		String str = "Non-veg";
		System.out.println("Hotel Grand View");

		switch (str){

		case "Veg" :
		{
			String str1 = "Paneer Tikka";
			switch (str1) {
				
				case "Paneer Tikka":
					System.out.println("Panneer Tikka");
					break;

				case "Kaju Katali":
					System.out.println("Kaju Katali");
					break;
				}
			
		}
			
			
		case "Non-veg" :
		{
			String str1 = "Chicken Tikka";
			switch (str1) {

				case "Chiken Tikka":
					System.out.println("Chicken Tikka");
					break;

				case "Matan Masala":
					System.out.println("Matan Masala");
					break;

		       		}
		}
		break;
		}
		System.out.println("Thank You for visit");
	}
}

