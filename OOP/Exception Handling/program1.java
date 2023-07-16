// IOException ( CompileTime Exception)

import java.io.*;
class Demo{
	public static void main(String[]args){   // throws IOException error

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		String str = br.readLine();     // error
	}
}
