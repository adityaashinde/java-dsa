// Question 1
// Write a program in which students should enter marks for 5 different subjects. If all subjects has above passing marks add them and provide to switch case to print grades(first class second class), if a students gets a fail in any subjects program should print "You failed the exam".

import java.io.*;
class Result{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int marathiMarks;
		System.out.println("Enter Marathi Marks =");
		marathiMarks = Integer.parseInt(br.readLine());

		int englishMarks;
		System.out.println("Enter English Marks =");
		englishMarks = Integer.parseInt(br.readLine());

		int mathsMarks;
		System.out.println("Enetr Maths Marks =");
		mathsMarks = Integer.parseInt(br.readLine());

		int socialscienceMarks;
		System.out.println("Enter Social Science Marks =");
		socialscienceMarks = Integer.parseInt(br.readLine());

		int scienceMarks;
		System.out.println("Enter Science Marks =");
		scienceMarks = Integer.parseInt(br.readLine());

		if(marathiMarks<35 || englishMarks<35 || mathsMarks<35 || socialscienceMarks<35 || scienceMarks<35){
			System.out.println("You failed Exam");
		}
		else{
			double avg = (marathiMarks + englishMarks + mathsMarks + socialscienceMarks + scienceMarks)/5;

			char ch;
			if(avg>75)
				ch='A';

			else if(avg>60)
				ch='B';

			else if(avg>50)
				ch='C';

			else if(avg>40)
				ch='D';

			else if(avg>=35)
				ch='E';

			else
				ch='F';

			switch(ch){
				case'A':
					System.out.println("First Class with Distinction");
					break;

				case'B':
					System.out.println("First Class");
					break;

				case'C':
					System.out.println("Second Class");
					break;

				case'D':
					System.out.println("Third Class");
					break;

				case'E':
					System.out.println("Pass");
					break;

				case'F':
					System.out.println("Fail");
					break;
			}		
		}
	}
}
