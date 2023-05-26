// public synchronized StringBuffer replace (int start, int end, String str);
// desc : Replace characters between index <code>start</code> and <code>end</code> with <code>str</code>
// 	If <code>end</code> is larger than the size od this StringBuffer, all characters after <code>start</code> are replaced
// parameters : Integer (start the beginning index of characters to delete;
// 		String (str the new <code>String</code> to insert;
// Return type : StringBuffer 

class ReplaceMethod{
	public static void main(String[]args){

		StringBuffer str1= new StringBuffer("Know The Code Until The Core");
		System.out.println(str1);
		str1.replace(14,20,"Till");
		System.out.println(str1);
	}
}
