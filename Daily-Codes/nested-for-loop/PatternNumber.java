// Print Pattern
// 1 
// 1 2 
// 1 2 3
// 1 2 3 4

class PatternNumber{
	public static void main(String[]args){

		for (int i=1; i<=4; i++){
			int num = 1;
			for (int j=1; j<=i; j++){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
