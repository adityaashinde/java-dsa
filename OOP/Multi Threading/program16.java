class MyThread extends Thread{

	MyThread(ThreadGroup tg, String str){
		super(tg,str);
	}

	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadGroupDemo16{
	public static void main(String[]args){

		ThreadGroup pthreadGP = new ThreadGroup("core2web");

		MyThread obj1 = new MyThread(pthreadGP,"c");
		MyThread obj2 = new MyThread(pthreadGP,"python");
		MyThread obj3 = new MyThread(pthreadGP,"Java");

		obj1.start();
		obj2.start();
		obj3.start();
	}
}
