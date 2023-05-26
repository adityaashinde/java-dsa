class Break2 {
	public static void main(String[]args){

		int N = 100;
		for (int i = 1; i <= N; i++){
			if(i % 3 == 0 && i % 5 == 0){
				break;
			}
			System.out.println(i);
		}
	}
}
