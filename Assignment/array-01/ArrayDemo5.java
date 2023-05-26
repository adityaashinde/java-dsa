// WAP to 10 input from the user and print only elements that are divisible by 5.
 
import java.util.*;
class ArrayDemo5{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements:");

		int count=0;
		for (int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			if(arr[i]%5==0){
				count++;
			}
		}
		System.out.println("Elements are divible by 5: " + count);
	}
}
