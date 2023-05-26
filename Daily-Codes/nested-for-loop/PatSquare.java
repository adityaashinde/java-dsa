// print pattern
// 1  4  3  16
// 5  36 7  
// 8  81
// 10

class PatSquare{
	public static void main(String []args){

		int num=1;
		for (int i=1; i<=4; i++){
			for (int j=1; j<=4-i+1; j++){

				if(j%2==0){
					System.out.print(num*num + " ");
				}
				else{
					System.out.print(num++ + " ");
				}
			}
			System.out.println();
		}
	}
}

