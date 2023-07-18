import java.io.*;
class BajajBikes{
	public static void main(String []args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		System.out.println("Wel-come to Bajaj Bike");
		System.out.println("Enter bike type you want to buy");
		System.out.println("1.Fully faired");
		System.out.println("2.Naked bikes");
		System.out.println("Enter your choice 1 or 2");
		
		choice = Integer.parseInt(br.readLine());

		switch(choice){
			case 1:{
				       int ch;
				       System.out.println("Fully faired Options are :");
				       System.out.println("1.Bajaj Pulser 220 F");
				       System.out.println("2.Bajaj Pulser RS 220");
				       System.out.println("3.Bajaj Pulser F 250");
				       System.out.println("Enter your option:");
				       ch=Integer.parseInt(br.readLine());
				       switch(ch){
					       case 1:
						       System.out.println("You selected option 1");
						       break;

						case 2:
						       System.out.println("You selectd option 2");
						       break;

						 case 3:
						       System.out.println("You selected option 3");
						       break;

						  default:
						       System.out.println("Invalid choice");
				       }
			}
			break;

			case 2:{
				       int ch;
				       System.out.println("Naked Bikes options are :");
				       System.out.println("1.Bajaj Pulser NS 200");
				       System.out.println("2.Bajaj Pulser NS 125");
				       System.out.println("3.Bajaj Pulser N 160");
				       System.out.println("Enter your option :");
				       ch = Integer.parseInt(br.readLine());
				       switch(ch){
					       case 1:
						       System.out.println("You selected option 1");
						       break;

						case 2:
						       System.out.println("You selected option 2");
						       break;

						case 3:
						       System.out.println("You selected option 3");
						       break;

						 default:
						       System.out.println("Invalid choice");
				       }
			}
			break;
			default:
			System.out.println("Invalid choice");
		}
	}
}
