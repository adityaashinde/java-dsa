// print pattern
// A b C d
// E f G h
// I j K l
// M n O p

class Pattern8{
	public static void main(String[]args){

		char ch1 ='A';
		// char ch2 ='a';
		
		for (int i=1; i<=4; i++){
			for (int j=1; j<=4; j++){
				if (j % 2 == 1){
					System.out.print((char)(64 + ch1) + " ");
				}
				else{
					System.out.print((char)(96 + ch1) + " ");
				}
				ch1++;
				// ch2++;
			}
			System.out.println();
		}
	}
}
