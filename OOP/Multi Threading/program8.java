class MyThread extends Thread{
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo8{
	public static void main(String[]args){

		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
		
		MyThread obj1 = new MyThread();
		obj1.start();

		t.setPriority(7);

		MyThread obj2 = new MyThread();
		obj2.start();
	}
}
