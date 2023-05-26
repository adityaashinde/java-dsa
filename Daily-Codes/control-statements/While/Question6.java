// Given an integer N , Print all its digit
// Input : 6531 , Output : 1 , 3 , 5 , 6

class Question6 {
	public static void main(String [] args){

		int N = 6531;
		while(N!=0){
		System.out.println(N%10);
		N = N/10;
		}
	}
}

