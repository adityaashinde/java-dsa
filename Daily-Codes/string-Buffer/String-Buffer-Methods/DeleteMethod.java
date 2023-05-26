// method : public synchronized StringBuffer delete(int start, int end);
// desc : Delete characters from this <code> StringBuffer </code>
// 	  <code>delete(10,12)</code> will delete 10 and 11, but not 12.
// 	  -It is harmless for the end to be larger than length().
// parameter : Integer(start the first chracter to delete),
// 		Integer(end the index after the last charcter to delete).
// Return Type : StringBuffer

class DeleteMethod{
	public static void main(String[]args){

		StringBuffer sb = new StringBuffer("Core2WEB");
		sb.delete(3,7);
		System.out.println(sb);
	}
}
