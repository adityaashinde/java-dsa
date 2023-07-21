// bad programming practice
// Don't override Start() method in Thread class

class MyThread extends Thread{

	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
	public void Start(){                                  // Don't call Start() method in multithreading
		System.out.println("In myThread Start");
		run();
	}
}
class ThreadDemo4{
	public static void main(String[]args){

		MyThread obj = new MyThread();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}
