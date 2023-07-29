// By Runnable

class MyThread implements Runnable{

	public void run(){
		System.out.println(Thread.currentThread());

		try{
			Thread.sleep(4000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroup19{
	public static void main(String[]args){

		ThreadGroup pThreadGroup = new ThreadGroup("India");

		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread t1 = new Thread(pThreadGroup, obj1, "Maha");
		Thread t2 = new Thread(pThreadGroup, obj2, "Goa");

		t1.start();
		t2.start();

		pThreadGroup.interrupt();

		System.out.println(pThreadGroup.activeCount());
		System.out.println(pThreadGroup.activeGroupCount());
	}
}
