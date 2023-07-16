// ArrayIndexOutOfBound Exception

class ArrayDemo{
	public static void main(String[]args){

		int arr[] = new int[]{1,2,3,4,5};

		for(int i=0; i<=arr.length; i++){
	 
			System.out.print(arr[i]);  // error:ArrayIndexOutOfBoundException
		}
	System.out.println();
	}
}
