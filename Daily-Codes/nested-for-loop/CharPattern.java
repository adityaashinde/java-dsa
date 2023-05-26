// print pattern
// A 1 B 2
// C 3 D
// E 4
// F

class CharPattern{
	public static void main(String[]args){

		char ch='A';
		int num=1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4-i+1; j++){

				if (j%2==1){
					System.out.print(ch++ + " ");
				}
				else{
					System.out.print(num++ + " ");
				}
			}
			System.out.println();
		}
	}
}
