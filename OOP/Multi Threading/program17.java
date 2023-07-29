class MyThread extends Thread{

	MyThread(ThreadGroup tg, String str){
		super(tg,str);
	}

	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo17{
	public static void main(String[]args){

		ThreadGroup pthreadGP = new ThreadGroup("India");

		MyThread t1 = new MyThread(pthreadGP, "Maha");
		MyThread t2 = new MyThread(pthreadGP, "Goa");

		t1.start();
		t2.start();

		ThreadGroup cthreadGP = new ThreadGroup(pthreadGP, "Pakistan");

		MyThread t3 = new MyThread(cthreadGP, "Karachi");
		MyThread t4 = new MyThread(cthreadGP, "Lahore");

		t3.start();
		t4.start();

		ThreadGroup cthreadGP2 = new ThreadGroup(pthreadGP, "Bangladesh");

		MyThread t5 = new MyThread(cthreadGP2, "Dhaka");
		MyThread t6 = new MyThread(cthreadGP2, "Manipur");

		t5.start();
		t6.start();

		cthreadGP.interrupt();

		System.out.println(pthreadGP.activeCount());
		System.out.println(pthreadGP.activeGroupCount());
	}
}
