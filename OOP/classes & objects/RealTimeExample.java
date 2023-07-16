class IPLMatch{
	String match = "MI VS LSG";
	int matchNo = 63;
	String tossResult = "MI win the Toss & choose the field first";

	void LSG(){
		int lsgRuns = 177;
		int lsgWickets = 3;
		String result = "LSG won by the 5 runs";

		System.out.println("Today's Match : " + match);                                                                                                               System.out.println("Match No : " + matchNo);                                                                                                                  System.out.println("Toss : " + tossResult);                                                                                                                                                                                              		                                                                        System.out.println();

		System.out.println("LSG Runs : " + lsgRuns);
		System.out.println("LSG Wickets : " + lsgWickets);
		System.out.println("Match Result : "+ result);
	}
	void MI(){
		int miRuns = 172;
		int miWickets = 5;
		String result = "MI Loss ";

		System.out.println();

		System.out.println("MI Runs : "+miRuns);
		System.out.println("MI Wickets : "+ miWickets);
		System.out.println("Match Result : "+ result);
	}
}
class MatchResult{
	public static void main(String[]args){

		IPLMatch obj = new IPLMatch();
		obj.LSG();
		obj.MI();
	}
}


