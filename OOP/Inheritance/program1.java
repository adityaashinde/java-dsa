class Exams{

	Exams(){
		System.out.println("Exam Time!!😶");
		System.out.println("Eat|Sleep|Study|Repeat");
		System.out.println(this);
	}

	void backlogExam(){

		System.out.println("Backlog exams start's 6 June");
	}
}

class regularExam extends Exams{

	regularExam(){

		System.out.println("Regular exams start's 21 June");
		System.out.println(this);
	}
}

class Student{
	public static void main(String[]args){

		Exams obj1 = new regularExam();
		obj1.backlogExam();  			
	}
}

