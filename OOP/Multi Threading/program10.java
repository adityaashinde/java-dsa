class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}
class ThreadDemo10{
	public static void main(String[]args){

		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());

		t.setPriority(7);

		MyThread obj1 = new MyThread();
		obj1.start();

		t.setPriority(9);
	//	t.setPriority(11);                  // java.lang.IllegalArgumentException
	//	It gives Priority 1 to 10
		MyThread obj2 = new MyThread();
		obj2.start();

	}
}
