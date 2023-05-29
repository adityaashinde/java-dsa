// 1 2 3 4
// 2 3 4 5
// 3 4 5 6
// 4 5 6 7

class Pattern1234{
	public static void main(String[]args){

		for(int i=1;i<=4;i++){
			int x=i;
			for(int j=1; j<=4; j++){

				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}
	}
}
