// Given the temperature of a person in fareheit
// Print whether the person has high , normal, low temperature
// > 98.6  = high
// 98.0 <= && <= 98.6 = Normal
// < 98.0 = Low

class Question4 {
	public static void main (String[] args){

		float temp = 92.6f;

		if (temp > 98.6f ){
		System.out.println("High temp");
		}

		else if(temp < 98.6f ){
		System.out.println("Low temp");
		}

		else{
		System.out.println("Normal temp");
		}
	}
}
