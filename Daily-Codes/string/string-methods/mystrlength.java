// mystrlength function

import java.io.*;
class MyStrLength{
	
		static int mystrlen (String str){
			char arr[] = str.toCharArray();
			int count = 0;
			for(int i=0;i<arr.length;i++){
				count++;
			}
			return count;
		}

		public static void main(String[]args)throws IOException{

			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			
			String str1 = br.readLine();
			String str2 = br.readLine();

			if(mystrlen(str1) == mystrlen(str2)){
				System.out.println("String are Equal");
			}
			else{
				System.out.println("String are Unequal");
			}
	}
}
