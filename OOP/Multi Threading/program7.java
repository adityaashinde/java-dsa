// creating Thread using Runnable Interface

class MyThread implements Runnable{                  // implementing Runnable
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo7{
	public static void main(String[]args){

		MyThread obj = new MyThread();
		Thread t = new Thread(obj); 	       // creating Thread class & calling MyThread(obj)
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
