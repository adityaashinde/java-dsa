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
class ThreadGroup20{
	public static void main(String[]args){

		ThreadGroup pThreadGrp = new ThreadGroup("Core2web");

		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread p1 = new Thread(pThreadGrp, obj1, "C/CPP");
		Thread p2 = new Thread(pThreadGrp, obj2, "Java");

		p1.start();
		p2.start();

		pThreadGrp.interrupt();

		System.out.println(pThreadGrp.activeCount());
		System.out.println(pThreadGrp.activeGroupCount());
	}
}
