// print pattern
// 1  4  9
// 16 25 36
// 49 64 81

class Pattern6{
	public static void main(String args[]){

		int num=1;
		for (int i=1; i<=3; i++){
			for (int j=1; j<=3; j++){
				System.out.print(num*num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
