// method     : public static cancat (String str)
// desc       : concaticate string to this string i.e Another string is concatinated with the first string.
// 		Implementations new array of character whose length is sum of str1.length and str2.length.
// parameter  : string
// returntype :	string

class StringConcat{
       public static void main(String[]args){

	       String str1 = "Core2";
	       String str2 = "web";

	       String str3 = str1.concat(str2);

	       System.out.println(str3);
       }
}       
