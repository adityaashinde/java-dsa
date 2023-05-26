// print pattern
// 1  2  9
// 4  25 6
// 49 8  81

class Pattern7{
	public static void main(String[]args){

		int num=1;
		for (int i=1; i<=3; i++){
			for (int j=1; j<=3; j++){

				if(num % 2 == 0){
					System.out.print(num + " ");
				}
				else{
					System.out.print(num*num + " ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
