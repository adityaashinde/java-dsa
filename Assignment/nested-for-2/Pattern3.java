// Print Pattern
// 14 15 16 17
// 15 16 17 18
// 16 17 18 19
// 17 18 19 20


class Pattern3{
	public static void main(String []args){

		int k = 0;
		for (int i=1; i<=4; i++){ 

			for(int j=1; j<=4; j++){

				System.out.print((k+13+j) + " ");
			}
			System.out.println();
                        k++;
			
		}
	}
}
