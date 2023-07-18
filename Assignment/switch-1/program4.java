import java.util.*;
class ShowTime{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		int choice;

		System.out.println("What's your interest?");
		System.out.println("1.Movies");
		System.out.println("2.Series");
		System.out.println("Enter your choice 1 or 2 :");

		choice = sc.nextInt();

		switch(choice){

			case 1:{
				int wish;
				System.out.println("Movie you wish to watch today:");
				System.out.println("1.Founder");
				System.out.println("2.Snowden");
				System.out.println("3.Jobs");
				System.out.println("4.Her");
				System.out.println("5.Social Network");
				System.out.println("6.Wall-E");
				System.out.println("7.AI");
				System.out.println("Enter your choice :");
				wish = sc.nextInt();

				switch(wish){
					case 1:
						System.out.println("You wished to watch Founder");
						break;
					
					case 2:
						System.out.println("You wished to watch Snowden");
						break;
					
					case 3:
						System.out.println("You wished to watch Jobs");
						break;

					case 4:
						System.out.println("You wished to watch Her");
						break;

					case 5:
						System.out.println("You wished to watch Social Network");
						break;

					case 6:
						System.out.println("You wished to watch Wall-E");
						break;

					case 7:
						System.out.println("You wished to watch AI");
						break;

					default:
						System.out.println("Invalid Choice");
				}
			}
			break;

			case 2:{
			
				       int wish;
				       System.out.println("Best series to watch");
				       System.out.println("1.Silicon Vally");
				       System.out.println("2.Devs");
				       System.out.println("3.the IT crowd");
				       System.out.println("4. Mr Robot");
				       System.out.println("Enter your choice :");
				       
				       wish=sc.nextInt();
				       switch(wish){
					       case 1:
						       System.out.println("You wished to watch Silicon Vally series");
						       break;

						case 2:
						       System.out.println("You wished to watch Devs series");
						       break;

						case 3:
						       System.out.println("You wished to watch the IT crowd series");
						       break;

						case 4:
							System.out.println("You wished to watch Mr Robot series");
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
