// print following pattern 
// 5 5 5 5
// 5 5 5 5
// 5 5 5 5

class NestedForloop{
	public static void main(String[]args){

		int N = 5;
		for (int i = 1; i<=3; i++){
			for (int j = 1; j <= 4 ; j++){
				System.out.print(" 5 ");
			} 
			System.out.println();
		}
	}
}
