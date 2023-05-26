// Given an integer N. Print all its digit 
// Assume : N >= 0 ; Input : 6531, Output : 15


class Question7 {
	public static void main (String[]args){

		int N = 6531;
		int sum;
		while (N!=0){
		int rem (N%10);
		sum = sum + rem;
		N = N/10
		}
		System.out.println(sum);
	}
}
